package by.spring.action;

@StringedInstrument
public class Guitar implements Instrument {

    @Override
    public void play() {
        System.out.println("Strum strum strum");
    }
}
