package com.kodilla.kodillalibrary;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class LoanTest {

    @Test
    public void testGettersAndSetters() {
        // When
        Loan loan = new Loan();
        loan.setId(1L);

        BookCopy bookCopy = mock(BookCopy.class);
        loan.setCopy(bookCopy);

        Reader reader = mock(Reader.class);
        loan.setReader(reader);

        LocalDate loanDate = LocalDate.of(2022, 1, 1);
        loan.setLoanDate(loanDate);

        LocalDate returnDate = LocalDate.of(2022, 2, 1);
        loan.setReturnDate(returnDate);

        // Then
        assertLoanValues(loan);
    }


    private void assertLoanValues(Loan loan) {

        assertEquals(1L, loan.getId());
        assertNotNull(loan.getCopy());
        assertNotNull(loan.getReader());
        assertEquals(LocalDate.of(2022, 1, 1), loan.getLoanDate());
        assertEquals(LocalDate.of(2022, 2, 1), loan.getReturnDate());
    }
}
