import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (1 or 2)");

        Scanner getInput = new Scanner(System.in);
        String input = getInput.nextLine();

        if (Objects.equals(input, "1"))
        {
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you ! He opens his jaws and...");
            System.out.println("Gobbles you down in one bite!");
        }
        else if (Objects.equals(input, "2"))
        {
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you ! He opens his jaws and...");
            System.out.println("Welcomes you in and offers you treasure!");
        }
        else
        {
            System.out.println("Please enter 1 or 2");
        }


    }
}
