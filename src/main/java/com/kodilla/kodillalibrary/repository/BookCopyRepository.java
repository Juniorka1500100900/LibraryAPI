package com.kodilla.kodillalibrary.repository;

import com.kodilla.kodillalibrary.BookCopy;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface BookCopyRepository extends CrudRepository<BookCopy, Long> {
    List<BookCopy> findByTitleId(Long titleId);
}