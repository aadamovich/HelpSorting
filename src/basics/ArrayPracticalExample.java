package basics;

public class ArrayPracticalExample {
    public static void main(String[] args) {

        int []table = {324, 34, 53, 53, 54, 23, 5,656,78,95, 56,478};

        for(int value : table){
            if(value % 2 == 0){
                System.out.println("even number : " + value);
            } else {
                System.out.println("odd number : " + value);
            }
        }

    }
}
