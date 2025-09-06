package org.example;


import com.example.Main;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {


    @Test
    void mainMethodShouldPrintHelloWorld() {
        // Arrange: Capture System.out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Act: Run the main method
        Main.main(new String[]{});

        // Restore original System.out
        System.setOut(originalOut);

        // Assert: Check output
        assertThat(outContent.toString().trim()).isEqualTo("Hello World");
    }
}
