package by.spring.action;

import org.springframework.beans.factory.annotation.Autowired;

public class Instrumentalist implements Performer {

    private String song;

    @Autowired
    private Instrument instrument;

    @Autowired
    public Instrumentalist(Instrument instrument) {
        this.instrument = instrument;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    @Autowired
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Autowired
    public void heresYourInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }
}
