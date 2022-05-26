package basics;

import java.text.DecimalFormat;

public class Formatting {
    public static void main(String[] args) {

        double income = 14563.356546d;
        String text = "Monta";
        String text1 = "salary";

        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println(income);
        System.out.print(income);
        System.out.print(income);

        // floating point values - %f
        // integers - %d
        //Strings - %

        System.out.println(df.format(income));

        System.out.println();

        System.out.println("My salary is " + income + " and I'm rich");
        System.out.printf("My name is %s. My %s is %.2f and I'm rich\n",text,text1, income);
        System.out.println();

        double roundedValue = Math.round(income * 100.0)/100.0;
        double roundedValue1 = Math.round(income * 1000.0)/1000.0;
        System.out.println(roundedValue);
        System.out.println(roundedValue1);


    }
}
