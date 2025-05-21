package Book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class BookManagerTest {

    private BookManager manager;

    @BeforeEach
    public void setUp() {
        manager = new BookManager();
    }

    @Test
    public void testAddBook() {
        manager.addBook("Clean Code");
        manager.addBook("Effective Java");

        List<String> books = manager.getBooks();
        assertEquals(2, books.size());
        assertTrue(books.contains("Clean Code"));
        assertTrue(books.contains("Effective Java"));
    }

    @Test
    public void testEmptyBookList() {
        assertEquals(0, manager.getBookCount());
    }
}
