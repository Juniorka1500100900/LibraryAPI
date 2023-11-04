package com.kodilla.kodillalibrary.service;

import com.kodilla.kodillalibrary.BookCopy;
import com.kodilla.kodillalibrary.Loan;
import com.kodilla.kodillalibrary.Reader;
import com.kodilla.kodillalibrary.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {
    private final LoanRepository loanRepository;

    @Autowired
    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public List<Loan> getAllLoans() {
        return (List<Loan>) loanRepository.findAll();
    }

    public Loan getLoanById(Long id) {
        return loanRepository.findById(id).orElse(null);
    }

    public Loan borrowBook(Loan loan) {
        return null;
    }

    public Loan returnBook(Long id) {
        return null;
    }

    public boolean borrowBook(Reader reader, BookCopy bookCopy) {
        return false;
    }
}