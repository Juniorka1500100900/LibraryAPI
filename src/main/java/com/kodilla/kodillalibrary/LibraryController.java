package com.kodilla.kodillalibrary;

import com.kodilla.kodillalibrary.service.BookCopyService;
import com.kodilla.kodillalibrary.service.LoanService;
import com.kodilla.kodillalibrary.service.ReaderService;
import com.kodilla.kodillalibrary.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/library")
public class LibraryController {
    private final ReaderService readerService;
    private final TitleService titleService;
    private final BookCopyService bookCopyService;
    private final LoanService loanService;

    @Autowired
    public LibraryController(ReaderService readerService, TitleService titleService, BookCopyService bookCopyService, LoanService loanService) {
        this.readerService = readerService;
        this.titleService = titleService;
        this.bookCopyService = bookCopyService;
        this.loanService = loanService;
    }

    @PostMapping("/addReader")
    public Reader addReader(@RequestBody Reader reader) {
        return readerService.addReader(reader);
    }

    @PostMapping("/addTitle")
    public Title addTitle(@RequestBody Title title) {
        return titleService.addTitle(title);
    }

    @PostMapping("/addBookCopy")
    public BookCopy addBookCopy(@RequestBody BookCopy bookCopy) {
        return bookCopyService.addBookCopy(bookCopy);
    }

    @PutMapping("/updateBookCopyStatus/{id}")
    public BookCopy updateBookCopyStatus(@PathVariable Long id, @RequestParam String status) {
        return bookCopyService.updateBookCopyStatus(id, status);
    }

    @GetMapping("/availableCopies/{titleId}")
    public int getAvailableCopiesCount(@PathVariable Long titleId) {
        return bookCopyService.getAvailableCopiesCount(titleId);
    }

    @PostMapping("/borrowBook")
    public Loan borrowBook(@RequestBody Loan loan) {
        return loanService.borrowBook(loan);
    }

    @PutMapping("/returnBook/{id}")
    public Loan returnBook(@PathVariable Long id) {
        return loanService.returnBook(id);
    }
}
