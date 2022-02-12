package basics;

public class MathClass {
    public static void main(String[] args) {

        float num = 5.4974f;

        System.out.println(num);
        System.out.println((int) num);

        // Round down
        System.out.println(Math.floor(num));

        // Round up
        System.out.println(Math.ceil(num));

        // Rounding according to math rules
        System.out.println(Math.round(num));

        // Modulo (mudulis)
        System.out.println(Math.abs(-100));

        // Power
        System.out.println(Math.pow(3,2));

        //Max value
        System.out.println(Math.max(145,87));

        //Min value
        System.out.println(Math.min(54, 69));

        //Root
        System.out.println(Math.sqrt(64));

        // Random
        System.out.println((int)  (Math.random() * 10) +1);



    }
}
