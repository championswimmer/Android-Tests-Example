package in.championswimmer.android_tests_example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by championswimmer on 6/1/16.
 */
public class MainActivityTests {

    @Test
    public void testFareFromKm() throws Exception {
        assertEquals(25.0, MainActivity.fareFromKm(2), 0.001);
        assertEquals(34.0, MainActivity.fareFromKm(3), 0.001);
    }

    @Test
    public void testFormatFare () throws Exception {
        assertEquals("25.23", MainActivity.formatFare(25.2344));
    }
}
