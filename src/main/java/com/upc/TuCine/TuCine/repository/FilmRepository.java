package com.upc.TuCine.TuCine.repository;

import com.upc.TuCine.TuCine.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Integer> {
    boolean existsFilmByTitle(String title);
    List<Film> findFilmsByTitleContainingIgnoreCase(String title);
}
