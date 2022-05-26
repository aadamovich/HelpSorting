package Basics2;

public class Methods {
    public static void main(String[] args) {

        int x = 15;
        printName("Monta");
       // printName(); won't work if you have argument name in brackets
        printName("Cat");
        System.out.println( returnName("Teddy"));

        String greetings1 = returnName("Bob");
        System.out.println(greetings1);

        personInfo("John", 35);
        personInfo("Monta", 31);

        System.out.println(sum(8,19,12054));

        determineEven(18);
        determineEven(15);

    }

    public static void printName(String name){
        // String name = "Monta";
        System.out.println("Hello " + name);
    }

    public static String returnName(String name){
        String greetings = "Hello " + name;
        return greetings;
    }

    public static void personInfo(String name, int age){
        System.out.printf("Your name is %s and your are %d years old \n", name, age);
    }

    public static int sum(int num1, int num2, int num3){
        return (num1 + num2 + num3);
    }

    public static void determineEven(int number){
        if(number % 2 != 0){
            return;
        }
        System.out.println(number);
    }
}
