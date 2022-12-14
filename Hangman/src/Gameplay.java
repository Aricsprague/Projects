import java.util.*;
import java.lang.Math;

public class Gameplay {
    String[] wordBank = {"cat","dog","bread","zebra","coffee","computer","win",
                        "power","monster","sauce","phone","cup","lighter","notepad",
                        "cord","mouse","water"};
    final Scanner getGuess = new Scanner(System.in);
    String word;
    String yn="";
    String redundantGuess="";
    String missedLetters="";
    String letterGuessed="";
    int wrongGuesses = 0;
    List<Character> playerGuessInput = new ArrayList<>();
    public void playGame(Scanner getGuess) {
        List<String> wordList = new ArrayList<>(Arrays.asList(wordBank));
        this.word = wordList.get(randomNumber());

        System.out.println("H A N G M A N");
        checkGuess(word, playerGuessInput);

        do {
            System.out.println("\nGuess a letter. ");
            boolean isGuessedLetter = testGuessForCharacter(word, playerGuessInput);

            if (!isGuessedLetter) {
                missedLetters += letterGuessed;
                wrongGuesses++;
            } if (redundantGuess.contains(letterGuessed)) {
                System.out.println("You have already guessed that letter. Choose again.");
            } else {
                redundantGuess += letterGuessed;
            } if (checkGuess(word, playerGuessInput)) {
                System.out.println("\nYou correctly guessed: \""+ word + "\" before running out of time.");
                replay(wordList, playerGuessInput);
            }
        } while (wrongGuesses < 4);

        System.out.println("\nYou didn't guess the word in time. it was: " + word);
        replay(wordList, playerGuessInput);
    }

    protected void replay(List<String> wordList, List<Character> playerGuessInput){
            System.out.println("Replay? (y or n)");
            Scanner replay = new Scanner(System.in);
            yn = replay.next();

            if (yn.equals("y")) {
                System.out.println("H A N G M A N");
                word = "";
                redundantGuess = "";
                missedLetters = "";
                letterGuessed = "";
                wrongGuesses = 0;
                playerGuessInput.clear();
                word = wordList.get(randomNumber());
                checkGuess(word, playerGuessInput);
            } else {
                System.exit(0);
            }
    }

    public boolean testGuessForCharacter (String word, List<Character> playerGuessInput){
        String input = getGuess.nextLine();
        playerGuessInput.add(input.charAt(0));
        letterGuessed = String.valueOf(input.charAt(0));
        return word.contains(input);
    }

    public boolean checkGuess(String word, List<Character> playerGuessInput){
        System.out.println(gallows(wrongGuesses));
        int correctCharCount = 0;
        System.out.println("Missed letters: " + missedLetters);

        for (int i = 0; i < word.length(); i++) {
            if (playerGuessInput.contains(word.charAt (i))) {
                System.out.print(word.charAt (i)) ;
                correctCharCount++;
            } else {
                System.out.print("_");
            }
        }

        return (word.length() == correctCharCount) ;
    }

    protected Integer randomNumber(){
        int min=0;
        int max= wordBank.length-1;
        return (int)(Math.random()*(max-min+1)+min);
    }

    protected String gallows(int wrongGuesses) {
        switch (wrongGuesses){
            case 1:
                return String.join(
                        "\n", "+---+", "O   |",
                        "    |", "    |", "   ===");
            case 2:
                return String.join(
                        "\n", "+---+", "O   |",
                        "|   |", "    |", "   ===");
            case 3:
                return String.join(
                        "\n", "+---+", "O   |",
                        "|   |", "|   |", "   ===");
        }
        return String.join(
                "\n", "+---+", "    |",
                "    |", "    |", "   ===");
    }
}
