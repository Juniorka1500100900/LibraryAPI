package com.kodilla.kodillalibrary.repository;

import com.kodilla.kodillalibrary.Reader;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReaderRepository extends CrudRepository<Reader, Long> {
    List<Reader> findByLastName(String lastName);
}