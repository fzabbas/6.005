package abc.player;

import java.util.Map;

public class AbcHeader {
    private final int index;
    private final String title;
    private final String key;
    private String composer;
    private Fraction length;
    private Fraction meter;
    private Tempo tempo;
    
    String DEFAULT_COMPOSER = "Unkown";
    Fraction DEFAULT_LENGTH = new Fraction(1,8);
    Fraction DEFAULT_METER = new Fraction(4,4);
    Tempo DEFAULT_TEMPO = new Tempo(DEFAULT_LENGTH, 100);
    
    
    public AbcHeader(int index, String title, String key) {
        this.index=index;
        this.title=title;
        this.key=key;
        this.composer=DEFAULT_COMPOSER;
        this.length=DEFAULT_LENGTH;
        this.meter=DEFAULT_METER;
        this.tempo= DEFAULT_TEMPO;
    }
    
    public int getIndex() {return this.index;}
    public String getTitle() { return this.title;}
    public String getKey() {return this.key;}
    public String getComposer() {return this.composer;}
    public Fraction getLength() {return this.length;}
    public Fraction getMeter() {return this.meter;}
    public Tempo getTempo() {return this.tempo;}
    
    public void setComposer(String input) {
        this.composer=input;
    }
    public void setLength(Fraction input) {
        this.length=input;
    }
    public void setMeter(Fraction input) {
        this.meter = input;
    }
    public void setTempo(Fraction input1, int input2) {
        this.tempo = new Tempo (input1, input2);
    }
    
    public String toString() {
        String abctext = ("Index: " + getIndex() + 
                "\nTitle: "+ getTitle() + 
                "\nKey: " + getKey() +
                "\nComposer: " + getComposer()+
                "\nLength: "+ getLength()+
                "\nMeter: "+ getMeter()+
                "\nTempo: "+ getTempo());
        return abctext;
    }
    

}
