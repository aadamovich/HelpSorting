package homeworks;

public class Homework_10_Discount {
    public static void main(String[] args) {
        System.out.printf("Price with discount: %.2f EUR",discount(1000, 56));
    }

    public static float discount(float price, float discountPercent){

        return (price -(discountPercent/100)*price);
    }
}

/*

import java.text.DecimalFormat;                // Other example

public class Discount {
    public static void main(String[] args) {

        System.out.println(discount(100,10));
        System.out.println(discount(89,20));

    }

    public static float discount(float price, float discount){
        DecimalFormat df = new DecimalFormat("0.00");
        discount /= 100;
        float result = price - (price * discount);
        return Float.parseFloat(df.format(result));
    }


}
*/
