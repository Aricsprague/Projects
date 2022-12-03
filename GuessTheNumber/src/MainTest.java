import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;
public class MainTest {

    final Main g = new Main();

    @Test
    public void testPlayAgain() {
        Main.playAgain = "y";
        assertEquals("y", Main.playAgain);
        Main.playAgain = "n";
        assertEquals("n", Main.playAgain);
    }

    @Test
    public void guess() {
        //assertEquals();
    }
}