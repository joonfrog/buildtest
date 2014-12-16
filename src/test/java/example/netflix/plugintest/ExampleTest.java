package example.netflix.plugintest;

import org.junit.*;
import static org.junit.Assert.*;

public class ExampleTest {
    @Test
    public void canaryTest() {
        Example example = new Example();
        assertEquals("Hi test", example.sayHi("test"));
    }
}
