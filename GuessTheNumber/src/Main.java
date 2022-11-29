import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        //declarations
        String playAgain= "";
        String playHard= "";
        String playerName= "";
        Scanner getGuess = new Scanner(System.in);
        Scanner getInput = new Scanner(System.in);
        Scanner replay = new Scanner(System.in);
        Scanner hardMode = new Scanner(System.in);

        //Get player name
        System.out.println("Hello! what is your name?");
        try {
            playerName = getInput.nextLine();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Would you like to play hard mode? (y or n)");
        try {
            playHard = hardMode.nextLine();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        //replay check
        do{
            if (playHard.equals("n")){
                    do {
                        //Generate easy number
                        RandomNumber number = new RandomNumber();
                        //Start game dialog
                        startDialog(playerName, number);
                        int i;

                        //for loop for gameplay
                        i = guess(getGuess, playerName, number);

                        //If statement for player not guessing correctly in 6 tries
                        lost(number, i);

                        playAgain = Main.playAgain(replay);

                        if (playAgain.equals("y")){
                            System.out.println("Would you like a harder number? (y or n)");
                            //Try-Catch for hard mode prompt
                            try {
                                playHard = hardMode.nextLine();
                            } catch (Exception e){
                                System.out.println(e.getMessage());
                            }
                        }

                    } while (playAgain.equals("y") && playHard.equals("n"));
            }
            else {
                do {
                    //Generate hard number
                    HarderNumber number = new HarderNumber();
                    startDialogHard(playerName, number);
                    int i;

                    //If statement for player not guessing correctly in 6 tries
                    i = hardGuess(getGuess, playerName, number);
                    lostHard(number, i);

                    playAgain = Main.playAgain(replay);

                    if (playAgain.equals("y")){
                         System.out.println("Would you like continue playing hard mode? (y or n)");
                        try {
                            playHard = hardMode.nextLine();
                        } catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                    }

                }   while (playAgain.equals("y") && playHard.equals("y"));
            }

        } while (playAgain.equals("y"));
}

    private static String playAgain(Scanner replay) {
        String playAgain="";
        System.out.println("Would you like to play again? (y or n)");
        try {
            playAgain = replay.nextLine();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return playAgain;
    }

    private static void startDialog(String playerName, RandomNumber number) {
        System.out.println("Well, " + playerName + ", I am thinking of a number between " + number.min + " and " + number.max + ".");
        System.out.println("Take a guess.");
    }

    private static void startDialogHard(String playerName, HarderNumber number) {
        System.out.println("Well, " + playerName + ", I am thinking of a number between " + number.min + " and " + number.max + ".");
        System.out.println("Take a guess.");
    }

    private static void lostHard(HarderNumber number, int i) {
        if (i == 7){
           System.out.println("Too bad! You didn't guess the number fast enough. :(");
           System.out.println("The number was: " + number.genNumber);
        }
    }

    private static void lost(RandomNumber number, int i) {
        if (i == 7){
            System.out.println("Too bad! You didn't guess the number fast enough. :(");
            System.out.println("The number was: " + number.genNumber);
        }
    }

    private static int hardGuess(Scanner getGuess, String playerName, HarderNumber number) {
        int guess=0;
        int i;
        for(i=1; i<7; i++){
            try{
                guess = getGuess.nextInt();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            if (guess == number.genNumber) {
                System.out.println("Good job, " + playerName + "! You guessed my number in " + i + " guesses!");
                break;
            }
            else if(guess> number.genNumber) {
                System.out.println("Your guess is too high.");
                System.out.println("Take a guess.");
            }
            else {
                System.out.println("Your guess is too low.");
                System.out.println("Take a guess.");
            }

        }
        return i;
    }

    private static int guess(Scanner getGuess, String playerName, RandomNumber number) {
        int guess=0;
        int i;
        for(i=1; i<7; i++){
            try{
            guess = getGuess.nextInt();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            if (guess == number.genNumber) {
                System.out.println("Good job, " + playerName + "! You guessed my number in " + i + " guesses!");
                break;
            }
            else if(guess> number.genNumber) {
                System.out.println("Your guess is too high.");
                System.out.println("Take a guess.");
            }
            else {
                System.out.println("Your guess is too low.");
                System.out.println("Take a guess.");
            }

        }
        return i;
    }
}