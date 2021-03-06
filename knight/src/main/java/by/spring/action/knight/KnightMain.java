package by.spring.action.knight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        Knight knight = (Knight) context.getBean("knight");
        try {
            knight.embarkOnQuest();
        } catch (QuestException e) {
            e.printStackTrace();
        }
    }
}
