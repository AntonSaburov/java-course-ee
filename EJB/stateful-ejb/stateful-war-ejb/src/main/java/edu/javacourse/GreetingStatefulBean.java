package edu.javacourse;

import javax.ejb.Stateful;

/**
 * @author ASaburov
 */
@Stateful(name = "GreetingStatefulEJB")
public class GreetingStatefulBean implements Greeting {

    @Override
    public String sayHello(String name) {
        return "Hello " + name + ". hash: " + hashCode();
    }

}
