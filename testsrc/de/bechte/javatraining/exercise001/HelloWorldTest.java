package de.bechte.javatraining.exercise001;

import de.bechte.javatraining.common.ConsoleTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest extends ConsoleTest {
    @Test
    void verifyHelloWorldIsPrinted() {
        HelloWorld.main(new String[] {});
        assertEquals("Hello World!", getSystemOut());
    }
}