import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpeakersTest {
    Speakers speakers;
    Stereo stereo;
    @Before
    public void before(){
        Radio radio = new Radio("sony", "80");
        CDPlayer cdPlayer = new CDPlayer(2, "sony", "20");
        RecordDeck recordDeck = new RecordDeck(2, "sony", "2.1");
        String name = "Sony";
        stereo = new Stereo(name, cdPlayer, recordDeck, radio, 5);
        speakers = new Speakers();
    }

    @Test
    public void connect() {
        assertEquals("Speakers connected to Sony", speakers.connect(stereo));
    }
}