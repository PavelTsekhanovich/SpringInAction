package by.spring.action;

public class Instrumentalist implements Performer {

    public void perform() throws PerformanceException {
        instrument.play();
    }

    private Instrument instrument;

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public Instrument getInstrument() {
        return instrument;
    }
}
