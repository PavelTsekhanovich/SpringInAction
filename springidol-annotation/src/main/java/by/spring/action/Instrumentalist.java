package by.spring.action;

import org.springframework.beans.factory.annotation.Autowired;

public class Instrumentalist implements Performer{

    @Autowired
    private Instrument instrument;

    private String song;

    @Autowired
    public Instrumentalist(Instrument instrument) {
        this.instrument = instrument;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    @Autowired
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

    @Autowired
    public void heresYourInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
