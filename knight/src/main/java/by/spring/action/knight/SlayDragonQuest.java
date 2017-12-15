package by.spring.action.knight;

public class SlayDragonQuest implements Quest{

    @Override
    public void embark() throws QuestException {
        System.out.println("Slaying Dragon");
    }
}
