package com.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testPrintHelloWorld() {
        // Redirect System.out to capture printed content
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the main method
        App.main(null);

        // Restore the original System.out
        System.setOut(System.out);

        // Check if "Hello, World!" is printed
        assertEquals("Hello, World!", outContent.toString().trim());
    }
}
