package eu.laramartin.testingexamples;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Created by lara on 19.03.17.
 */
public class UtilsTest {

    @Test
    public void get_goodbye_when_42() {
        String value = Utils.getString(42);
        assertTrue(value.equals("goodbye"));
    }

    @Test
    public void get_nothing_when_not_42() {
        String value = Utils.getString(2);
        assertTrue(value.equals("nothing"));
    }
}