import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declarations
        String input="";
        String pathInput="";
        String puzzleOne="";
        String puzzleTwo="";

        //Intro
        System.out.println(Dialog.intro());
        Scanner getInput = new Scanner(System.in);

        //Gameplay
        input = questOrPrison(input, getInput);
        System.out.println(Dialog.journey());

        input = investigateOrIgnore(input, getInput);
        System.out.println(Dialog.mountain());

        pathInput = whichPath(pathInput, getInput);
        System.out.println(Dialog.caveMouth());

        puzzleOne = firstPuzzle(puzzleOne, getInput);
        secondPuzzle(puzzleTwo, getInput);

        input = straightRightEndings(input, pathInput, getInput);

        alternateEndings(input, puzzleOne, getInput);
    }

    private static void alternateEndings(String input, String puzzleOne, Scanner getInput) {
        do {
                try {
                    input = getInput.nextLine();
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
                switch (input) {
                    case "accept":
                        System.out.println(Dialog.accept());
                        System.out.println("THE END!");
                        break;
                    case "reject":
                        System.out.println(Dialog.reject());
                        System.out.println("GAME OVER!");

                        break;
                    case "help":
                        System.out.println("Look for CAPS");
                        break;
                }
            } while (!(puzzleOne.contentEquals("accept") || puzzleOne.contentEquals("reject")));
    }

    private static String straightRightEndings(String input, String pathInput, Scanner getInput) {
        if (pathInput.contains("straight")) {
                System.out.println(Dialog.insideCaveStraightPath());
                do {
                    try {
                        input = getInput.nextLine();
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    switch (input) {
                        case "plead":
                            System.out.println(Dialog.plead());
                            break;
                        case "comment":
                            System.out.println(Dialog.comment());
                            break;
                        case "help":
                            System.out.println("Look for CAPS");
                            break;
                    }
                } while (!(input.contentEquals("plead") || input.contentEquals("comment")));


            } else {
                System.out.println(Dialog.insideCaveRightPath());
                do {
                    try {
                        input = getInput.nextLine();
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    switch (input) {
                        case "give":
                            System.out.println(Dialog.give());
                            System.out.println("GAME OVER!");
                            break;
                        case "take":
                            System.out.println(Dialog.take());
                            System.out.println("THE END!");
                            break;
                        case "help":
                            System.out.println("Look for CAPS");
                            break;
                    }
                } while (!(input.contentEquals("give") || input.contentEquals("take")));
            }
        return input;
    }

    private static void secondPuzzle(String puzzleTwo, Scanner getInput) {
        do {
                try {
                    puzzleTwo = getInput.nextLine();
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
                if (puzzleTwo.equals("water")) {
                    System.out.println(Dialog.puzzleTwoWin());
                } else {
                    System.out.println("Nothing happens...");
                }
            } while (!(puzzleTwo.contentEquals("water")));
    }

    private static String firstPuzzle(String puzzleOne, Scanner getInput) {
        do {
            try {
                puzzleOne = getInput.nextLine();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            if (puzzleOne.equals("3.14") || puzzleOne.equals("314")) {
                System.out.println(Dialog.puzzleOneWin());
            } else {
                System.out.println("Nothing happens...");
            }
        } while (!(puzzleOne.contentEquals("3.14") || puzzleOne.contentEquals("314")));
        return puzzleOne;
    }

    private static String whichPath(String pathInput, Scanner getInput) {
        do {
            try {
                pathInput = getInput.nextLine();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }                switch (pathInput) {
                case "left":
                    System.out.println(Dialog.left());
                    break;
                case "right":
                    System.out.println(Dialog.right());
                    break;
                case "straight":
                    System.out.println(Dialog.straight());
                    break;
                case "help":
                    System.out.println("Look for CAPS");
                    break;
            }
        } while (!(pathInput.contentEquals("right") || pathInput.contentEquals("straight")));
        return pathInput;
    }

    private static String investigateOrIgnore(String input, Scanner getInput) {
        do {
            try {
                input = getInput.nextLine();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            switch (input) {
                case "investigate":
                    System.out.println(Dialog.investigate());
                    break;
                case "ignore":
                    System.out.println(Dialog.ignore());
                    break;
                case "help":
                    System.out.println("Look for CAPS");
                    break;
            }
        } while (!(input.contentEquals("investigate") || input.contentEquals("ignore")));
        return input;
    }

    private static String questOrPrison(String input, Scanner getInput) {
        do {
            //User inputs choice
            try {
                input = getInput.nextLine();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            switch (input) {
                //user enters "prison" dialog is printed, game ends
                case "prison":
                    System.out.println(Dialog.prison());
                    System.out.println("GAME OVER!");
                    break;
                //user enters "quest" quest dialog is printed, switch breaks, do-while should stop
                case "quest":
                    System.out.println(Dialog.quest());
                    break;
                //hint dialog
                case "help":
                    System.out.println("Look for CAPS");
                    break;
            }
            //do-while should keep repeating the switch until user enters "prison" or "quest" however, once entered, the loop never exits.
        } while (!(input.contentEquals("prison") || input.contentEquals("quest")));
        return input;
    }
}