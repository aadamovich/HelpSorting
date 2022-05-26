package sorting;

import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {

        int[] arr = {6,35,7,3,1,67, 34,65, 100};
        int n = arr.length;

        //One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++){

            //Fnd the minimum element in unsorted array
            int min_idx = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            //Swap min value with element in place after sorted subarray
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
