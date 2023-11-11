import com.kodilla.kodillalibrary.Reader;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReaderTest {

    @Test
    public void testGettersAndSetters() {
        // Given
        Reader reader = new Reader();
        reader.setId(1L);
        reader.setFirstName("John");
        reader.setLastName("Doe");
        reader.setAccountCreationDate(LocalDate.now());

        // Then
        assertEquals(1L, reader.getId());
        assertEquals("John", reader.getFirstName());
        assertEquals("Doe", reader.getLastName());
        assertEquals(LocalDate.now(), reader.getAccountCreationDate());
    }

    @Test
    public void testConstructor() {
        // Given
        Long id = 1L;
        String firstName = "John";
        String lastName = "Doe";

        // When
        Reader reader = new Reader(id, firstName, lastName);

        // Then
        assertEquals(id, reader.getId());
        assertEquals(firstName, reader.getFirstName());
        assertEquals(lastName, reader.getLastName());
        assertEquals(LocalDate.now(), reader.getAccountCreationDate());
    }
}