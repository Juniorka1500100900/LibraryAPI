package com.kodilla.kodillalibrary.repository;

import com.kodilla.kodillalibrary.Title;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TitleRepository extends CrudRepository<Title, Long> {
    List<Title> findByAuthor(String author); // Przykład niestandardowej metody
}