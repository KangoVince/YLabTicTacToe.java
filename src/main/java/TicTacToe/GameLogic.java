package TicTacToe;

import java.util.Scanner;

public class GameLogic {

    final String NOUGHT = "O";
    final String CROSS = "X";
    public final String EMPTY = "-";


    static boolean isValidMove(int move) {
        if (Field.field[move - 1] == "-") {
            return true;
        } else {
            System.out.println("Busy. Try another field");
            return false;
        }
    }

    String getMove(int move) {
        return Field.field[move - 1];
    }

    public static void playerCrossMakeMove() {
        System.out.println("Select move");
        Scanner scanner = new Scanner(System.in);
        int move;
        while (true) {
            try {
                move = Integer.parseInt(scanner.nextLine());

                if (isValidMove(move)) {
                    Field.field[move - 1] = "X";
                    break;
                }
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Wrong input");
            }
        }
    }

    public static void playerNaughtMakeMove() {
        System.out.println("Select move");
        Scanner scanner = new Scanner(System.in);
        int move;
        while (true) {
            try {
                move = Integer.parseInt(scanner.nextLine());

                if (isValidMove(move)) {
                    Field.field[move - 1] = "O";
                    break;
                }
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Wrong input");
            }
        }
    }

     static boolean isCrossWin(String[] checkField) {

        if (
                        checkField[0] == "X" && checkField[4] == "X" && checkField[8] == "X" ||
                        checkField[3] == "X" && checkField[4] == "X" && checkField[5] == "X" ||
                        checkField[6] == "X" && checkField[4] == "X" && checkField[2] == "X" ||
                        checkField[7] == "X" && checkField[4] == "X" && checkField[1] == "X" ||
                        checkField[0] == "X" && checkField[3] == "X" && checkField[6] == "X" ||
                        checkField[6] == "X" && checkField[7] == "X" && checkField[8] == "X" ||
                        checkField[8] == "X" && checkField[5] == "X" && checkField[2] == "X" ||
                        checkField[0] == "X" && checkField[1] == "X" && checkField[2] == "X"
        ) {
            System.out.println("Player " + Game.secondPlayerName + " wins!");
            return true;
        } else {
            return false;
        }
    }

    static boolean isNoughtWin(String[] checkField) {
        if (
                        checkField[0] == "X" && checkField[4] == "X" && checkField[8] == "X" ||
                        checkField[3] == "O" && checkField[4] == "O" && checkField[5] == "O" ||
                        checkField[6] == "O" && checkField[4] == "O" && checkField[2] == "O" ||
                        checkField[7] == "O" && checkField[4] == "O" && checkField[1] == "O" ||
                        checkField[0] == "O" && checkField[3] == "O" && checkField[6] == "O" ||
                        checkField[6] == "O" && checkField[7] == "O" && checkField[8] == "O" ||
                        checkField[8] == "O" && checkField[5] == "O" && checkField[2] == "O" ||
                        checkField[0] == "O" && checkField[1] == "O" && checkField[2] == "O"
        ) {
            System.out.println("Player " + Game.firstPlayerName + " wins!");
            return true;
        } else {
            return false;
        }
    }

}

