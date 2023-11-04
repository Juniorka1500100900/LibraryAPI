package com.kodilla.kodillalibrary.repository;

import com.kodilla.kodillalibrary.Loan;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface LoanRepository extends CrudRepository<Loan, Long> {
    List<Loan> findByReaderId(Long readerId);
}