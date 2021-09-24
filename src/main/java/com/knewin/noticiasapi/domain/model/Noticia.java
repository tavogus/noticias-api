package com.knewin.noticiasapi.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;


import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Access(AccessType.FIELD)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Noticia {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String url;
    private String titulo;
    private String subtitulo;
    private String autor;
    private String data;

    @ElementCollection
    private List<String> conteudo;

    public Noticia() {

    }

    public Noticia(String url, String titulo, String subtitulo, String autor, String data, List<String> conteudo) {
        this.url = url;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.autor = autor;
        this.data = data;
        this.conteudo = conteudo;
    }

}
