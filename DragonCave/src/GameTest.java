import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    final Game g = new Game(new Scanner(System.in));

    @BeforeEach
    void setUp() {
        g.lastPlayerInput = "";
        g.ending="";
    }

    @Test
    void alternateEndings() {
        g.lastPlayerInput = "accept";
        assertEquals(Dialog.accept(), g.alternateEndings(""));
        g.lastPlayerInput = "reject";
        assertEquals(Dialog.reject(), g.alternateEndings(""));
        g.lastPlayerInput = "help";
        assertNull(g.alternateEndings(""))
        ;g.lastPlayerInput = "yargihargyhar";
        assertNull(g.alternateEndings(""));
    }

    @Test
    void investigateOrIgnore() {
        g.lastPlayerInput = "investigate";
        assertEquals(Dialog.investigate(), g.investigateOrIgnore(""));
        g.lastPlayerInput = "ignore";
        assertEquals(Dialog.ignore(), g.investigateOrIgnore(""));
        g.lastPlayerInput = "help";
        assertNull(g.investigateOrIgnore(""))
        ;g.lastPlayerInput = "oogabooga";
        assertNull(g.investigateOrIgnore(""));
    }

    @Test
    void straightRightEndings() {
        g.ending = "straight";
        g.lastPlayerInput = "plead";
        assertEquals(Dialog.plead(), g.straightRightEndings(""));
        g.ending = "straight";
        g.lastPlayerInput = "comment";
        assertEquals(Dialog.comment(), g.straightRightEndings(""));
        g.ending = "straight";
        g.lastPlayerInput = "help";
        assertNull(g.straightRightEndings(""));
        g.ending = "straight";
        g.lastPlayerInput = "hohoho";
        assertNull(g.straightRightEndings(""));
        g.ending = "right";
        g.lastPlayerInput = "give";
        assertEquals(Dialog.give(), g.straightRightEndings(""));
        g.ending = "right";
        g.lastPlayerInput = "take";
        assertEquals(Dialog.take(), g.straightRightEndings(""));
        g.ending = "right";
        g.lastPlayerInput = "help";
        assertNull(g.straightRightEndings(""));
        g.ending = "right";
        g.lastPlayerInput = "merry christmas";
        assertNull(g.straightRightEndings(""));
    }

    @Test
    void questOrPrison() {
        g.lastPlayerInput = "quest";
        assertEquals(Dialog.quest(), g.questOrPrison(""));
        g.lastPlayerInput = "prison";
        assertEquals(Dialog.prison(), g.questOrPrison(""));
        g.lastPlayerInput = "help";
        assertNull(g.questOrPrison(""))
        ;g.lastPlayerInput = "im a bumble bee";
        assertNull(g.questOrPrison(""));
    }

    @Test
    void whichPath() {
        g.lastPlayerInput = "left";
        assertNull(g.whichPath(""));
        g.lastPlayerInput = "right";
        assertEquals(Dialog.right(), g.whichPath(""));
        g.lastPlayerInput = "straight";
        assertEquals(Dialog.straight(), g.whichPath(""));
        g.lastPlayerInput = "help";
        assertNull(g.whichPath(""))
        ;g.lastPlayerInput = "squeeeeee";
        assertNull(g.whichPath(""));
    }

    @Test
    void firstPuzzle() {
        g.lastPlayerInput = "3.14";
        assertEquals(Dialog.puzzleOneWin(), g.firstPuzzle(""));
        g.lastPlayerInput = "Krankenschwester";
        assertNull(g.firstPuzzle(""));
    }

    @Test
    void secondPuzzle() {
        g.lastPlayerInput = "water";
        assertEquals(Dialog.puzzleTwoWin(), g.secondPuzzle(""));
        g.lastPlayerInput = "Brauchen";
        assertNull(g.secondPuzzle(""));
    }
}
/*    void questOrPrison() {
        final List<List<String>> testInputs = List.of(
                List.of("quest", "prison", "help", "im a bumble bee"),
                List.of(Dialog.quest(), Dialog.prison(), null, null));
        //final List<String> testExpectedStrings = List.of(Dialog.quest(), Dialog.prison(), null, null);
        for (var l : testInputs) {
        g.lastPlayerInput = l.get(0);
        assertEquals(l.get(0), g.questOrPrison(""));
        }
    }*/