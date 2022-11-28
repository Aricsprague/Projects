import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input;
        String pathInput;
        String puzzleOne;
        String puzzleTwo;
        //Intro
        System.out.println(Dialog.intro());
        Scanner getInput = new Scanner(System.in);

            //iterate loop once initially
            do {
                //User inputs choice
                input = getInput.nextLine();
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

            System.out.println(Dialog.journey());

            do {
                input = getInput.nextLine();
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

            System.out.println(Dialog.mountain());

            do {
                pathInput = getInput.nextLine();
                switch (pathInput) {
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

            System.out.println(Dialog.caveMouth());

            do {
                puzzleOne = getInput.nextLine();
                if (puzzleOne.equals("3.14") || puzzleOne.equals("314")) {
                    System.out.println(Dialog.puzzleOneWin());
                } else {
                    System.out.println("Nothing happens...");
                }
            } while (!(puzzleOne.contentEquals("3.14") || puzzleOne.contentEquals("314")));

            do {
                puzzleTwo = getInput.nextLine();
                if (puzzleTwo.equals("water")) {
                    System.out.println(Dialog.puzzleTwoWin());
                } else {
                    System.out.println("Nothing happens...");
                }
            } while (!(puzzleTwo.contentEquals("water")));

            if (pathInput.contains("straight")) {
                System.out.println(Dialog.insideCaveStraightPath());
                do {
                    input = getInput.nextLine();
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
                    input = getInput.nextLine();
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

            do {
                input = getInput.nextLine();
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
}