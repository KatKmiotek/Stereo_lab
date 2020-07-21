import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StereoTest {
    Stereo stereo;
    @Before
    public void before(){
        Radio radio = new Radio("sony", "80");
        CDPlayer cdPlayer = new CDPlayer(2, "sony", "20");
        RecordDeck recordDeck = new RecordDeck(2, "sony", "2.1");
        String name = "Sony";
        stereo = new Stereo(name, cdPlayer, recordDeck, radio, 5);
    }

    @Test
    public void raiseVolume() {
        stereo.raiseVolume(5);
        assertEquals(10, stereo.getVolume());
    }

    @Test
    public void lowerVolume() {
        stereo.lowerVolume(2);
        assertEquals(3, stereo.getVolume());
    }
    @Test
    public void canRadioPlay(){
        assertEquals("Radio is playing", stereo.radioPlay());
    }
    @Test
    public void canCdPlay(){
        assertEquals("Cd player is playing", stereo.cdPlay());
    }
    @Test
    public void canRadioTune(){
        assertEquals("Radio 1", stereo.radioTune());
    }
}