package by.spring.action;

import javax.inject.Inject;
import javax.sound.midi.Instrument;

public class Instrumentalist implements Performer{

    @Inject
    private Instrument instrument;

    @Override
    public void perform() throws PerformanceException {

    }
}