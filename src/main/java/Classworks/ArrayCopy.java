package Classworks;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        int[] myArray = {1,2,3,4,5,6,7,8,9};
        // int [] copyArray = myArray;
        int[] copyArray = new int[9];
        
        for (int i = 0; i < myArray.length; i++){
          copyArray[i] = myArray[i];
        }

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(copyArray));

    }
}
