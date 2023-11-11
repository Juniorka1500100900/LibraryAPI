package com.kodilla.kodillalibrary;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class BookCopyTest {

    @Test
    public void testGettersAndSetters() {
        // When
        BookCopy bookCopy = new BookCopy();
        bookCopy.setId(1L);

        Title title = mock(Title.class);
        bookCopy.setTitle(title);

        bookCopy.setStatus("Available");

        // Then
        assertBookCopyValues(bookCopy);
    }


    private void assertBookCopyValues(BookCopy bookCopy) {
        // Then
        assertEquals(1L, bookCopy.getId());
        assertNotNull(bookCopy.getTitle());
        assertEquals("Available", bookCopy.getStatus());
    }
}
