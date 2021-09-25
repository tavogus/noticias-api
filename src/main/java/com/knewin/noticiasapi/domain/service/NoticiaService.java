package com.knewin.noticiasapi.domain.service;

import com.knewin.noticiasapi.domain.model.Noticia;
import com.knewin.noticiasapi.domain.repository.NoticiaRepository;
import net.minidev.json.JSONObject;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

@Service
public class NoticiaService {

    private static Logger logger = org.slf4j.LoggerFactory.getLogger(NoticiaService.class);
    private final NoticiaRepository repository;

    @Autowired
    public NoticiaService(NoticiaRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Noticia salvar(String urlNoticia){

        Noticia noticia = null;
        try {
            noticia = converteUrlParaNoticia(urlNoticia);
            noticia = repository.save(noticia);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return noticia;
    }

    @Transactional
    public List<Noticia> buscarTodas(){
        return repository.findAll();
    }

    private Noticia converteUrlParaNoticia(String urlNoticia){


        Noticia noticia = null;
        List<String> paragrafo = new ArrayList<String>();

        logger.info("url: " + urlNoticia);

        try {

            Document document = Jsoup.connect(urlNoticia).get();
            Element titulo = document.getElementsByClass("page-title-1").first();
            Element subtitulo = document.getElementsByClass("article-lead").first();
            Element autor = document.getElementsByClass("author-name").first();
            Element data = document.getElementsByClass("posted-on").first();
            List<Element> conteudo = document.select("div.article-content > p");

            conteudo.forEach(c -> paragrafo.add(c.text()));

            noticia = new Noticia(urlNoticia, titulo.text(), subtitulo.text(), autor.text(), formatarData(data), paragrafo);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return noticia;
    }

    private String formatarData(Element data) {
        String[] dataFormatada = data.text().split(" -");
        return dataFormatada[0];
    }

    private Noticia buscarOuFalhar(Long id){
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException(""));
    }
}
