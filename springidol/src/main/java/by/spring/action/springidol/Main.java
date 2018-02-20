package by.spring.action.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-idol.xml");
        Object obj = context.getBean("kenny3");
        if (obj instanceof Performer){
            Performer performer = (Performer) obj;
            try {
                performer.perform();
            } catch (PerformanceException e) {
                e.printStackTrace();
            }
        }
    }
}
