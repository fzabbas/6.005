package abc.sound;

public class Header{
    private final String composer;
    private final String key;
    private final String length;
    private final String meter;
    private final int tempo;
    private final String title;
    private final String index;
    
    public Header(String composer, String key, String length, String meter, Integer tempo, String title, String index) {
        this.composer = composer;
        this.key = key;
        this.length = length;
        this.meter = meter;
        this.tempo = tempo;            
        this.title = title;
        this.index = index;
    }
    
    private void checkRep() {
        //to be impmented
    }    

}
