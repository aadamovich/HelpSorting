package sorting;

import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {

        int[] arr = {6,35,7,3,1,67, 34,65, 100};
        int n = arr.length;

        for(int i = 1; i < n; i++){
            int key = arr[i];

            int j = i - 1;

            //Move elements of key, behind all elements
            // from sorted part that are greater than key
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.println("Sorted array " + Arrays.toString(arr));
    }
}
