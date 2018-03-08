package by.spring.action;

import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class Instrumentalist implements Performer{

    @Inject
    private Instrument instrument;

    @Override
    public void perform() throws PerformanceException {
        instrument.play();
    }

    public Instrument getInstrument() {
        return instrument;
    }
}