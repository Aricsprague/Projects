import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class GameplayTest {

    final Gameplay g = new Gameplay();
    List<Character> testList;

    @BeforeEach
    void setUp() {
        g.word = "test";
        g.redundantGuess="";
        g.missedLetters="";
        g.letterGuessed="";
        g.yn="";
        g.wrongGuesses=0;
        testList= new ArrayList<>();
    }
/*
    @Test
    void playGame() {
    }

    @Test
    void replay() {
    }
*/
    @Test
    void testGuessForCharacter() {
        boolean output2 = g.testGuessForCharacter(g.word , testList);
        assertEquals(true, output2);
    }
/*
    @Test
    void checkGuess() {
    }

    @Test
    void randomNumber() {
    }

    @Test
    void gallows() {
    }*/
}