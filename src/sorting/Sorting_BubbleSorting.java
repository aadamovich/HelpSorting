package sorting;

import java.util.Arrays;

public class Sorting_BubbleSorting {
    public static void main(String[] args) {

        int[] arr = {1,35,7,3,6,54,2,1,64,32,35,6};
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1-i; j++){

                if(arr[j]>arr[j+1]){
                   // Swap arr[] with arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;



                }
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
