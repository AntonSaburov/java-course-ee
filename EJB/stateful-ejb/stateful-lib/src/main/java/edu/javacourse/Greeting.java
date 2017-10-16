package edu.javacourse;

import javax.ejb.Local;

/**
 * @author ASaburov
 */
@Local
public interface Greeting {

    String sayHello(String name);

}
