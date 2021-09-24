package com.knewin.noticiasapi.domain.repository;

import com.knewin.noticiasapi.domain.model.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticiaRepository extends JpaRepository<Noticia, Long> {
}
