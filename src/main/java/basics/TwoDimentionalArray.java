package basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDimentionalArray {
    public static void main(String[] args) {

        String[][] names = new String[2][5]; //[rows][columns]
        names [0][0] = "Tyron";
        names[0][1] = "Daren";
        names[0][2] = "Francis";
        names[0][3] = "Lewis";
        names[0][4] = "Rob";

        // Fill second row

        names [1][0] = "Israel";
        names[1][1] = "Khamzet";
        names[1][2] = "Cyril";
        names[1][3] = "Daniel";
        names[1][4] = "Max";

        // Array length => rows
        System.out.println(names.length);

        // Array length => columns
        System.out.println(names[0].length);

        for (int row = 0; row < names.length; row++){
            for (int columns = 0; columns < names[row].length; columns++){
                System.out.print(names[row][columns] + " ");
            }
            System.out.println();
        }

        // Example 2

        int [][] age = new int [][]{{15,25,45,60,75},{33,28,30,65,44}};
        System.out.println(Arrays.deepToString(age));

    }
}
