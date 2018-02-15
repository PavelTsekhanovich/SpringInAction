package by.spring.action.knight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        Object obj = context.getBean("knight");
        if (obj instanceof Knight) {
            Knight knight = (Knight) obj;
            try {
                knight.embarkOnQuest();
            } catch (QuestException e) {
                e.printStackTrace();
            }
        }
    }
}
