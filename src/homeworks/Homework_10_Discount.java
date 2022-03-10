package homeworks;

public class Homework_10_Discount {
    public static void main(String[] args) {
        System.out.printf("Price with discount: %.2f EUR",discount(1000, 45.6));
    }

    public static double discount(double price, double discountPercent){
        return (price -(discountPercent/100)*price);
    }
}
