import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Game {
    final Scanner playerInput;
    String lastPlayerInput=null;
    List<Function<String, String>> storyline;
    Game(Scanner playerIn){
        this.playerInput = playerIn;
        this.storyline = List.of(
                s -> questOrPrison(s), //done
                s -> investigateOrIgnore(s), //done
                s -> whichPath(s), //done
                s -> firstPuzzle(s),
                s -> secondPuzzle(s),
                s -> straightRightEndings(s), //done
                s -> alternateEndings(s) //done
        );
    }
    String ending;
    final static String ACCEPT = "accept";
    final static String REJECT = "reject";
    final static String PRISON = "prison";
    final static String QUEST = "quest";
    final static String NOTHING = "Nothing happened...";
    final static String HELP = "Look for CAPS";


    void playGame() {
        System.out.println(Dialog.intro());
        for (Function<String, String> f: this.storyline) {

            if(f == this.storyline.get(1)){
                System.out.println(Dialog.journey());
            } if(f == this.storyline.get(2)){
                System.out.println(Dialog.mountain());
            } if(f == this.storyline.get(3)){
                System.out.println(Dialog.caveMouth());
            } if(f == this.storyline.get(5)){
                System.out.println(Dialog.insideCaveStraightPath());
            }
            String lastResult = null;
            do {
                lastPlayerInput = this.getInput();
                if(f == this.storyline.get(5)){
                    lastResult = f.apply(this.ending);
                } else {
                    lastResult=f.apply(null);
                }

                if (lastResult != null) {
                    System.out.println(lastResult);
                }
            } while (lastResult == null);
        }
    }

    protected String getInput() {
        return playerInput.nextLine();
    }
    protected String questOrPrison(String lastInput) {
        String str=null;
        switch (lastPlayerInput) {
            case PRISON:
                str=Dialog.prison();
                break;
            case QUEST:
                str= Dialog.quest();

                break;
            case "help":
                System.out.println(HELP);
                break;
            default :
                System.out.println(NOTHING);
                break;
        }
    return str;
}
    protected String investigateOrIgnore(String lastInput) {
        String str=null;
        switch (lastPlayerInput) {
            case "investigate":
                str = Dialog.investigate();
                break;
            case "ignore":
                str = Dialog.ignore();
                break;
            case "help":
                System.out.println(HELP);
                break;
            default :
                System.out.println(NOTHING);
                break;
        }

        return str;
    }
    protected String whichPath(String lastInput) {
        String str=null;
        switch (lastPlayerInput) {
            case "left":
                System.out.println(Dialog.left());
                break;
            case "right":
                this.ending = "right";
                str = Dialog.right();
                break;
            case "straight":
                this.ending = "straight";
                str = Dialog.straight();
                break;
            case "help":
                System.out.println(HELP);
                break;
            default :
                System.out.println(NOTHING);
                break;
        }

        return str;
    }
    protected String firstPuzzle(String lastInput) {
        String str=null;
            //String puzzleOne = getInput();
            if (lastPlayerInput.equals("3.14") || lastPlayerInput.equals("314")) {
                str = Dialog.puzzleOneWin();
            } else {
                System.out.println(NOTHING);
            }
            return str;
    }
    protected String secondPuzzle(String lastInput) {
        String str=null;
            if (lastPlayerInput.equals("water")) {
                str =Dialog.puzzleTwoWin();
            } else {
                System.out.println(NOTHING);
            }
        return str;
    }
    protected String straightRightEndings(String lastInput) {
//this is right ish
        String str=null;
        if (ending.contains("straight")) {

            //no loop
            switch (lastPlayerInput) {
                case "plead":
                    str = Dialog.plead();
                    break;
                case "comment":
                    str = Dialog.comment();
                    break;
                case "help":
                    System.out.println(HELP);
                    break;
                default :
                    System.out.println(NOTHING);
                    break;
            }


        } else {
            System.out.println(Dialog.insideCaveRightPath());
            switch (lastPlayerInput) {
                case "give":
                    str = Dialog.give();
                    break;
                case "take":
                    str = Dialog.take();
                    break;
                case "help":
                    System.out.println(HELP);
                    break;
                default :
                    System.out.println(NOTHING);
                    break;
            }
        }
        return str;
    }
    protected String alternateEndings (String lastInput){
        String str = null;
        switch (lastPlayerInput) {
            case ACCEPT:
                str = Dialog.accept();
                break;
            case REJECT:
                str = Dialog.reject();
                break;
            case "help":
                System.out.println(HELP);
                break;
            default :
                System.out.println(NOTHING);
                break;
        }
        return str;
    }

}
