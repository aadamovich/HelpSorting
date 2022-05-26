package Classworks;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter size of side 1");
        double side1 = scanner.nextDouble();

        System.out.println("Please enter size of side 2");
        double side2 = scanner.nextDouble();

        System.out.println("Please enter size of side 3");
        double side3 = scanner.nextDouble();

        Triangle triangle = new Triangle();
        triangle.setSide1(side1);
        triangle.setSide2(side2);
        triangle.setSide3(side3);

        System.out.println("Triangle area: " + triangle.areaTriangle(side1,side2,side3));

   //     System.out.printf("Area of triangle is: %.2f ",areaTriangle(3, 10,100));

    }

    private double side1;
    private double side2;
    private  double side3;

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    private static boolean isValid(double side1, double side2, double side3){
        return  (side1+side2)>side3 && (side1 + side3)> side2 && (side2 + side3)>side1;
    }

    public static double areaTriangle(double side1, double side2, double side3){

        double p = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(p * (p - side1)*(p - side2)*(p-side3));

        if(isValid(side1,side2,side3)){
         //   System.out.println("Area of triangle is: " + area);
            return area;
        }
        System.out.println("Triangle is not valid");
        return 0;
    }

}
