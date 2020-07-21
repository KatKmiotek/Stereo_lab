import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new RecordDeck(2, "sony", "80");
    }

    @Test
    public void getPlaySeeds() {
        assertEquals(2, recordDeck.getPlaySeeds());
    }
}