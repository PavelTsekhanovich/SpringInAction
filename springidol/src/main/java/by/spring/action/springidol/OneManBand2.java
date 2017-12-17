package by.spring.action.springidol;

import java.util.Map;

public class OneManBand2 implements Performer{

    private Map<String, Instrument> instruments;

    public OneManBand2() {}

    @Override
    public void perform() throws PerformanceException {
        for (String key : instruments.keySet()){
            System.out.print(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }
}
