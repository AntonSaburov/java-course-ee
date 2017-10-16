package edu.javacourse;

import javax.ejb.Stateless;

/**
 * @author ASaburov
 */
@Stateless(name = "GreetingStatelessEJB")
public class GreetingStatelessBean implements Greeting {

    @Override
    public String sayHello(String name) {
        return "Hello " + name + ". hash: " + hashCode();
    }

}
