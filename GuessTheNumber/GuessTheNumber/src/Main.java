import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        //declarations
        int guess=0;

        String playAgain;
        String playHard;
        Scanner getGuess = new Scanner(System.in);
        Scanner getInput = new Scanner(System.in);
        Scanner replay = new Scanner(System.in);
        Scanner hardMode = new Scanner(System.in);

        //Get player name
        System.out.println("Hello! what is your name?");
        String playerName = getInput.nextLine();
        System.out.println("Would you like to play hard mode? (y or n)");
        playHard = hardMode.nextLine();



        //replay check
        do{
        if (playHard.equals("n")){ do {
            //Generate random number
            RandomNumber number = new RandomNumber();

            System.out.println("Well, " + playerName + ", I am thinking of a number between " + number.min + " and " + number.max + ".");
            System.out.println("Take a guess.");

            int i =0;

            //for loop for gameplay
            for(i=1; i<7; i++){
                guess = getGuess.nextInt();

                if (guess == number.genNumber) {
                    System.out.println("Good job, " + playerName + "! You guessed my number in " + i + " guesses!");
                    break;
                }
                else if(guess>number.genNumber) {
                    System.out.println("Your guess is too high.");
                    System.out.println("Take a guess.");
                }
                else {
                    System.out.println("Your guess is too low.");
                    System.out.println("Take a guess.");
                }

            }

            if (i == 7){
                System.out.println("Too bad! You didn't guess the number fast enough. :(");
                System.out.println("The number was: " + number.genNumber);
            }

            System.out.println("Would you like to play again? (y or n)");
            playAgain = replay.nextLine();

            if (playAgain.equals("y")){
                System.out.println("Would you like a harder number? (y or n)");
                playHard = hardMode.nextLine();
            }

    } while (playAgain.equals("y") && playHard.equals("n")); } else {
            do {
                //Generate random number
                HarderNumber number = new HarderNumber();

                System.out.println("Well, " + playerName + ", I am thinking of a number between " + number.min + " and " + number.max + ".");
                System.out.println("Take a guess.");

                int i =0;

                //for loop for gameplay
                for(i=1; i<7; i++){
                    guess = getGuess.nextInt();

                    if (guess == number.genNumber) {
                        System.out.println("Good job, " + playerName + "! You guessed my number in " + i + " guesses!");
                        break;
                    }
                    else if(guess>number.genNumber) {
                        System.out.println("Your guess is too high.");
                        System.out.println("Take a guess.");
                    }
                    else {
                        System.out.println("Your guess is too low.");
                        System.out.println("Take a guess.");
                    }

                }

                if (i == 7){
                    System.out.println("Too bad! You didn't guess the number fast enough. :(");
                    System.out.println("The number was: " + number.genNumber);
                }
                System.out.println("Would you like to play again? (y or n)");
                playAgain = replay.nextLine();

                if (playAgain.equals("y")){
                    System.out.println("Would you like continue playing hard mode? (y or n)");
                    playHard = hardMode.nextLine();
                }

            } while (playAgain.equals("y") && playHard.equals("y"));
        }



    } while (playAgain.equals("y"));
}
}