package abc.player;

import java.io.File;
import java.io.IOException;

/**
 * Main entry point of your application.
 */
public class Main {

    /**
     * Plays the input file using Java MIDI API and displays
     * header information to the standard output stream.
     * 
     * (Your code should not exit the application abnormally using
     * System.exit().)
     * 
     * @param file the name of input abc file
     * @throws IOException 
     */
    public static void play(String file) throws IOException {
        File abcFile = new File(file);
        Abc abc = Parser.parseAbc(abcFile);
        
    }

    public static void main(String[] args) throws IOException{
        play ("sample_abc/test.abc");
    }
}
