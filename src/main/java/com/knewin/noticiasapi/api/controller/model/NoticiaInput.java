package com.knewin.noticiasapi.api.controller.model;

import com.knewin.noticiasapi.domain.model.Noticia;
import lombok.Data;

@Data
public class NoticiaInput {

    private String url;

    public NoticiaInput(){}

    public NoticiaInput(Noticia noticia){
        this.url = noticia.getUrl();
    }
}
