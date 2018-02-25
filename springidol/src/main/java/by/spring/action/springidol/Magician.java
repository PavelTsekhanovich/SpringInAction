package by.spring.action.springidol;

public class Magician implements Performer{

    private MagicBox magicBox;
    private String magicWords;

    public Magician() {}

    @Override
    public void perform() throws PerformanceException {
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox;
    }

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }
}
