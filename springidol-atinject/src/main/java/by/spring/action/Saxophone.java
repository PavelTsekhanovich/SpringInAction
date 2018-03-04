package by.spring.action;

public class Saxophone implements Instrument{

    public Saxophone() {
    }

    @Override
    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
}
