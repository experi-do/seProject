package Book;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    private List<String> books;

    public BookManager() {
        books = new ArrayList<>();
    }

    public void addBook(String title) {
        books.add(title);
    }

    public List<String> getBooks() {
        return books;
    }

    public int getBookCount() {
        return books.size();
    }
}
