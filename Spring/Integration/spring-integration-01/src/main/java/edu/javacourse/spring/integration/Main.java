package edu.javacourse.spring.integration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;

/**
 * @author ASaburov
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        MessageChannel transformationChannel = context.getBean("transformationChannel", MessageChannel.class);

        transformationChannel.send(new GenericMessage<String>("hello"));
        transformationChannel.send(new GenericMessage<String>("world"));
    }

}
