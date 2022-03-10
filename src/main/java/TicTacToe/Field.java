package TicTacToe;


import java.util.Arrays;
import java.util.Objects;

public final class Field {

    public static String[] field = new String[9];

    public Field() {
    }



    public static void printField() {

        System.out.println("Field:\t \t \t \t \t| Controller:\n"
                + "|" + field[0] + "| \t" + "|" + field[1] + "| \t" + "|" + field[2] + "| \t" + "|1|" + "|2|" + "|3|  \n" +
                "|" + field[3] + "| \t" + "|" + field[4] + "| \t" + "|" + field[5] + "| \t" + "|4|" + "|5|" + "|6| \n" +
                "|" + field[6] + "| \t" + "|" + field[7] + "| \t" + "|" + field[8] + "| \t" + "|7|" + "|8|" + "|9| \n");
    }


    static boolean isFieldFull() {
        for (String s : field) {
            if (Objects.equals(s, "-")) {
                return false;
            }
        }
        return true;
    }

}
