package com.kodilla.kodillalibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TitleTest {

    @Test
    public void testGettersAndSetters() {
        // When
        Title title = new Title();
        title.setId(1L);
        title.setTitle("Example Title");
        title.setAuthor("Example Author");
        title.setPublicationYear(2022);

        // Then
        assertTitleValues(title);
    }

    private void assertTitleValues(Title title) {

        assertEquals(1L, title.getId());
        assertEquals("Example Title", title.getTitle());
        assertEquals("Example Author", title.getAuthor());
        assertEquals(2022, title.getPublicationYear());
    }
}
