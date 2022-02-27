package homeworks;

import java.util.Arrays;

public class Homework_6_Array {
    public static void main(String[] args) {

        int[] originalArray = {123,234,345,456,567,678,789,890,901,168};
        System.out.println("Original Array: " + Arrays.toString(originalArray));


        for(int i = 0; i < originalArray.length/2; i++){

             int temp = originalArray[i];
             originalArray[i] = originalArray[originalArray.length-i-1];
            originalArray[originalArray.length-i-1] = temp;
        }

        System.out.print("Reverse Array: " + Arrays.toString(originalArray));
    }
}
