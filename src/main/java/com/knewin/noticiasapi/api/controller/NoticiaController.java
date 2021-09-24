package com.knewin.noticiasapi.api.controller;

import com.knewin.noticiasapi.api.controller.model.NoticiaInput;
import com.knewin.noticiasapi.domain.model.Noticia;
import com.knewin.noticiasapi.domain.service.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/v1/noticias", produces = MediaType.APPLICATION_JSON_VALUE)
public class NoticiaController {

    private final NoticiaService service;

    @Autowired
    public NoticiaController(NoticiaService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Noticia adicionaNoticia(@RequestBody NoticiaInput noticiaInput){
        return service.salvar(noticiaInput.getUrl());
    }

    @GetMapping
    public List<Noticia> buscarTodas(){
        return service.buscarTodas();
    }
}
