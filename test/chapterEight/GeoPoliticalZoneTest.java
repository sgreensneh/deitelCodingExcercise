package chapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeoPoliticalZoneTest {


    @Test
    public void getZoneTest() {
        State state = new State();
        assertNotNull(GeoPoliticalZone.findZoneWithState("Benue"));

    }


}