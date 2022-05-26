package homeworks;

import java.util.Arrays;

public class Homework_9_Methods {
    public static void main(String[] args) {

        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] array2 = {12, 65, 98, 87, 23, 56, 1, 44, 8, 100};
        System.out.println("Original array: " + Arrays.toString(array));

        System.out.println("Minimum value for the above array: " + min(array));
        System.out.println("Minimum value for the above array: " + min(array2));
        System.out.println("Maximum value for the above array: " + max(array));
        System.out.println("Maximum value for the above array: " + max(array2));
        System.out.println("Average value for the above array: " + average(array));
        System.out.println("Average value for the above array: " + average(array2));
        System.out.println("Sum value for the above array: " + sum(array));
        System.out.println("Sum value for the above array: " + sum(array2));
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

    public static int sum(int[] array){
        int sum = 0;
        for( int value : array){
            sum += value;
        }
        return sum;
    }

    public static int average(int[] array){
        int sum = 0;
        int average = 0;
        for (int value : array){
            sum += value;
            average = sum / array.length;
        }
        return average;
    }

}

