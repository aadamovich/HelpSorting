package basics;

public class Casting {
    public static void main(String[] args) {
// AUTOMATIC (WIDENING) CONVERSION
        int num1 = 100;
        float num2 = num1;
        System.out.println(num1);
        System.out.println(num2);

        float temp = 40.7f;
        System.out.println(temp);
        int temp2 = (int) temp;
        System.out.println(temp2);
    }

}
