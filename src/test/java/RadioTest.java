import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RadioTest {

    Radio radio;
    @Before
    public void before(){
        radio = new Radio("sony", "20");
    }
    @Test
    public void canTune(){
        assertEquals("Radio 1", radio.tune());
    }

}