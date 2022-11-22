import java.lang.Math;
import java.util.Scanner;
public class Main {



    public static void main(String[] args) {
        //declarations
        int guess=0;

        String playAgain = "";
        Scanner getGuess = new Scanner(System.in);
        Scanner getInput = new Scanner(System.in);
        Scanner replay = new Scanner(System.in);

        //Generate random number
        int min = 1;
        int max = 20;
        int number = (int)(Math.random()*(max-min+1)+min);

        //replay check
        do {
            //Get player name
            System.out.println("Hello! what is your name?");
            String playerName = getInput.nextLine();
            System.out.println("Well, " + playerName + ", I am thinking of a number between 1 and 20.");
            System.out.println("Take a guess.");
            int i =0;

            //for loop for gameplay
            for(i=0; i<6; i++){
                guess = getGuess.nextInt();

                if (guess == number) {
                    System.out.println("Good job, " + playerName + "! You guessed my number in " + i + " guesses!");
                    break;
                }
                else if(guess>number) {
                    System.out.println("Your guess is too high.");
                    System.out.println("Take a guess.");
                }
                else {
                    System.out.println("Your guess is too low.");
                    System.out.println("Take a guess.");
                }

            }
            /*if (i == 5){
                System.out.println("Too bad! You didn't guess the number.)");
            }*/ //For some reason this if statement doesn't happen if you don't guess the number
            System.out.println("Would you like to play again? (y or n)");
            playAgain = replay.nextLine();

    } while (playAgain.equals("y"));

    }
}