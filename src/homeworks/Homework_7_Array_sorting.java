package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_7_Array_sorting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert size of Array:");
        int size = scanner.nextInt();
        int[] myArray = new int[size];

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Insert array element nr. " + (i + 1));
            myArray[i] = scanner.nextInt();
        }

        System.out.println("insert value you are searching in array: ");
        int keyValue = scanner.nextInt();

/*        for(int i = 0; i < size-1; i++){
            for (int j = 0; j < size - i -1; j++){

            if (myArray[j] > myArray[j+1]){
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                    System.out.println(myArray[j+1]);
            }
            }
        }*/
        System.out.println("You are searching value: " + keyValue);


        for (int i = 1; i < myArray.length; i++) {
            int temp = myArray[i];

            int j = i - 1;

            while (j >= 0 && myArray[j] > temp) {
                myArray[j + 1] = myArray[j];
                j--;
            }
            myArray[j + 1] = temp;
        }
        System.out.println("Sorted Array is : " + Arrays.toString(myArray));
        int first = 0;
        int last = size-1;
        int mid = first + (last - first) / 2;

        while (first <= last){
            if(myArray[mid] < keyValue){
                first = mid + 1;
            } else  if (myArray[mid] == keyValue){
                System.out.println("Element you search is at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");

        }
    }
}