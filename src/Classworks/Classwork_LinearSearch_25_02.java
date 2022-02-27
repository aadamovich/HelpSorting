package Classworks;

public class Classwork_LinearSearch_25_02 {
    public static void main(String[] args) {

        int[] arr = {123,5,3,64,234,643,245,65,34,67,86};
        int key = 65;
        boolean found = false;

        for(int i = 0; i< arr.length; i++){

            System.out.println(i);
            if (key == arr[i]){
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Element not found");
        }
    }


}
