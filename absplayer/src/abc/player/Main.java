package abc.player;

import java.io.File;
import java.io.IOException;

import abc.sound.Header;
import abc.sound.MusicBody;
import abc.sound.Parser;

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
        
        Header header = Parser.parseHeader(abcFile);
//        MusicBody music = Parser.parseMusic(abcFile);
    }

    public static void main(String[] args) throws IOException {
//        if(args.length > 0) {
//            play(args[0]);
//        }
        try {
            play("sample_abc/abc_song.abc");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // CALL play() HERE USING ARGS
    }
}
