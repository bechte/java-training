package de.bechte.javatraining.common;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConsoleTest {
    private PrintStream previousOut;
    private PrintStream previousError;

    private ByteArrayOutputStream systemOut;
    private ByteArrayOutputStream systemError;

    @BeforeEach
    void setUp() {
        previousOut = System.out;
        previousError = System.err;

        systemOut = new ByteArrayOutputStream();
        systemError = new ByteArrayOutputStream();

        System.setOut(new PrintStream(systemOut));
        System.setErr(new PrintStream(systemError));
    }

    @AfterEach
    void tearDown() {
        System.setOut(previousOut);
        System.setErr(previousError);
    }

    public String getSystemOut() {
        return systemOut.toString();
    }

    public String getSystemError() {
        return systemError.toString();
    }
}
