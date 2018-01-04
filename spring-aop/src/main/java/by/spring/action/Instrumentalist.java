package by.spring.action;

public class Instrumentalist implements Performer{

    private Instrument instrument;

    @Override
    public void perform() throws PerformanceException {
        instrument.play();
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
