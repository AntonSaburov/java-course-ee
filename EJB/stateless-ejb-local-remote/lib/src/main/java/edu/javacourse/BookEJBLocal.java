package edu.javacourse;

import javax.ejb.Local;
import java.util.List;

/**
 * @author ASaburov
 */

@Local
public interface BookEJBLocal {

    List<Book> getBooks();

}
