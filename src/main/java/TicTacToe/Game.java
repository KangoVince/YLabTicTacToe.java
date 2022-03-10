package TicTacToe;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Game {

    GameLogic gameLogic;
    static String firstPlayerName;
    static String secondPlayerName;

    public static void main(String[] args) {

        Arrays.fill(Field.field, "-");

        Scanner scan = new Scanner(System.in);
        System.out.println("Game begins. Please enter first player name:");
        firstPlayerName = scan.nextLine();
        System.out.println("First player is " + firstPlayerName + "! Please enter second player name:");
        secondPlayerName = scan.nextLine();
        System.out.println("Second player name is " + secondPlayerName + "! Game starts.");

        while (true) {
            Field.printField();
            GameLogic.playerCrossMakeMove();
            if (GameLogic.isCrossWin(Field.field)) {
                Field.printField();
                break;
            }
            GameLogic.playerNaughtMakeMove();
            if (GameLogic.isNoughtWin(Field.field)) {
                Field.printField();
                break;
            }

            if (Field.isFieldFull ()){
                Field.printField();
                System.out.println("Field if full. No one wins");
                break;
            }
        }

    }


}
