package by.spring.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-idol-annotation.xml");
        Object obj = context.getBean("piano");
        if (obj instanceof Piano) {
            Instrument instrument = (Instrument) obj;
            instrument.play();
        }
    }
}
