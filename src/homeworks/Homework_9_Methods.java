package homeworks;

import java.util.Arrays;

public class Homework_9_Methods {
    public static void main(String[] args) {

        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Original array: " + Arrays.toString(array));

        System.out.println("Maximum value for the above array: " + max(array));
        System.out.println("Minimum value for the above array: " + min(array));
    }

    public static int max(int[] array) {
        int maxResult = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxResult) {
               maxResult = array[i];
            }
        }
        return maxResult;
    }

    public static int min(int[] array){
        int minResult = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < minResult){
                minResult = array[i];
            }
        }
        return minResult;
    }
}

