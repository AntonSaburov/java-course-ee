package edu.javacourse.mockito;

import java.util.List;

/**
 * @author ASaburov
 */
public interface DAO {

    List<Book> getAllBooks();
    Book getBookById(Long id);
    Book getBookByName(String name);

}
