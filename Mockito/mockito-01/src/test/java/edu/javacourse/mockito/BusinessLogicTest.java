package edu.javacourse.mockito;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * @author ASaburov
 */
public class BusinessLogicTest {

    private static DAO dao;

    @BeforeClass
    public static void beforeClass() {
        dao = mock(DAO.class);

        final Book book1 = new Book(1L, "Java For Junior", "123");
        final Book book2 = new Book(2L, "Java For Middle", "456");
        final Book book3 = new Book(3L, "Java For Senior", "789");

        ArrayList<Book> list = new ArrayList() {{
            add(book1);
            add(book2);
            add(book3);
        }};

        when(dao.getAllBooks()).thenReturn(list);
        when(dao.getBookById(1L)).thenReturn(book1);
        when(dao.getBookById(2L)).thenReturn(book2);
        when(dao.getBookById(3L)).thenReturn(book3);
    }

    @Test
    public void getAllBooksNamesTest() {
        BusinessLogic logic = new BusinessLogic();
        logic.setDao(dao);

        List<String> booksNames = logic.getAllBooksNames();
        assertEquals(new ArrayList() {{
            add("Java For Junior");
            add("Java For Middle");
            add("Java For Senior");
        }}, booksNames);
    }

}
