package com.kodilla.kodillalibrary.service;

import com.kodilla.kodillalibrary.BookCopy;
import com.kodilla.kodillalibrary.repository.BookCopyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookCopyService {
    private final BookCopyRepository bookCopyRepository;

    @Autowired
    public BookCopyService(BookCopyRepository bookCopyRepository) {
        this.bookCopyRepository = bookCopyRepository;
    }

    public List<BookCopy> getAllBookCopies() {
        return (List<BookCopy>) bookCopyRepository.findAll();
    }

    public BookCopy getBookCopyById(Long id) {
        return bookCopyRepository.findById(id).orElse(null);
    }

    public BookCopy addBookCopy(BookCopy bookCopy) {
        return bookCopyRepository.save(bookCopy);
    }

    public BookCopy updateBookCopyStatus(Long id, String status) {
        Optional<BookCopy> optionalCopy = bookCopyRepository.findById(id);
        if (optionalCopy.isPresent()) {
            BookCopy copy = optionalCopy.get();
            copy.setStatus(status);
            return bookCopyRepository.save(copy);
        }
        return null;
    }

    public void deleteBookCopy(Long id) {
        bookCopyRepository.deleteById(id);
    }

    public int getAvailableCopiesCount(Long titleId) {
        return 0;
    }
}