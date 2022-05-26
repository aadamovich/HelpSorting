import java.text.DecimalFormat;
import java.time.*;
import java.util.Arrays;
import java.util.Scanner;

public class PreparingForTest {
    public static void main(String[] args) {

        PreparingForTest preparingForTest = new PreparingForTest();
        preparingForTest.setAge(65);
        preparingForTest.setName("Zuluraabs");
        preparingForTest.setTall(25.0f);

        System.out.println(preparingForTest.getName());
        System.out.println(preparingForTest.getAge());
        System.out.println(preparingForTest.getTall());
    }

    private String name = "Monta";
    private int age = 35;
    private float tall = 164.8f;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getTall() {
        return tall;
    }

    public void setTall(float tall) {
        this.tall = tall;
    }

    /*   public PreparingForTest(String name, int age, float tall){
        this.name = name;
        this.age = age;
        this.tall = tall;
    }

    public void personsInfo(){
        System.out.println("Your name is " + name);
        System.out.println("You are " + tall + " cm tall.");
        System.out.println("you are " + age + " years old.");
    }

    public static void main(String[] args) {

PreparingForTest preparingForTest = new PreparingForTest("Kiki",5,55.6f);
preparingForTest.personsInfo();

PreparingForTest preparingForTest1 = new PreparingForTest("Zutis",10,32.9f);
preparingForTest1.personsInfo();


    }*/

/*      printName("Monta");
      printName("Scotty");
        System.out.println(returnGreetings("Teddy"));
      personsInfo("Pukikapo", 123, 55);
        System.out.println("After 20 years I will be: " + ageAfter20Years(15) + " years old");


    }

    public static void printName(String name){
        System.out.println("Your name is: " + name);
    }

    public static String returnGreetings(String name){
        String greetings = "Hello " + name;
        return greetings;
    }

    public static void personsInfo(String name, int tall, int years){
        System.out.printf("Your name is %s. You are %d tall and %d years old\n",name, tall, years);
    }

    public static int ageAfter20Years(int age){
        int result = age + 20;
        return result;
    }*/

/*
        byte byte1 = 1;
        int numI = 5;
        double numD = 2.6d;
        float numF = 3.2f;
        long long1 = 21;
        char char1 = 'C';
        String string1 = "Hello World o World.";

        int[][] a = new int[][]{{1,2,3},{11,12,13}};
        System.out.println(Arrays.deepToString(a));
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
        }
        System.out.println();

        int[][] array2 = new int[3][3];
        array2 [0][0] = 10;
        array2 [0][1] = 20;
        array2 [0][2] = 40;
        array2 [1][0] = 150;
        array2 [1][1] = 160;
        array2 [1][2] = 170;
        array2 [2][0] = 210;
        array2 [2][1] = 220;
        array2 [2][2] = 230;

        System.out.println(array2.length);
        System.out.println(array2[0].length);

        for(int i = 0; i < array2.length; i++){
            for(int j = 0; j < array2[i].length; j++){
                System.out.print(array2[i][j] + " ");
            }
        }
*/


/*
        int[] array = new int[10];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        array[5] = 60;
        array[6] = 70;
        array[7] = 80;
        array[8] = 90;
        array[9] = 100;

        System.out.println(Arrays.toString(array));
        System.out.println(array.length);
        System.out.println("Count: " + array[0] + " + " + array[8] + " = " + (array[0] + array[8]));
        for(int i : array){
            System.out.println(i);
        }


        String[] arr = {"ABBA", "Cuba", "Goose"};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        Double[] array1 = new Double[]{12.2,33.3,21.0,45.7,55.8,55.9};
        System.out.println("Your rate is: " + array1[4]);
        array1[2] = 0.00;
        System.out.println(Arrays.toString(array1));
*/



/*        System.out.println(string1.trim());
        System.out.println(string1.charAt(0));
        System.out.println(string1.length());
        System.out.println(string1.charAt(string1.length()-1));
        System.out.println(string1.substring(3));
        System.out.println(string1.substring(1,5));
        System.out.println(string1.substring(string1.length()-6));

        System.out.println(string1);
        System.out.println(string1.replaceFirst("Hello", "Upsss"));
        System.out.println(string1.replaceAll("World", "Pig"));

        String stringNum = "123";
        String stringFloat = "2.56";
        int integerNum = Integer.parseInt(stringNum);
        System.out.println(integerNum);
        float floatNum = Float.parseFloat(stringFloat);
        System.out.println(floatNum);

        Scanner scanner1 = new Scanner(System.in);*/
   /*     LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, Month.NOVEMBER,30,13,35,55);
        System.out.println(localDateTime1);

       LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());

        LocalDate localDate1 = LocalDate.of(2020,06,16);
        System.out.println("Liva birthday on: " + localDate1);

        LocalTime localTime = LocalTime.now();
        System.out.println("Local time is: " + localTime);
        LocalTime localTime1 = LocalTime.now().withNano(0);
        System.out.println("Local time with nano: " + localTime1);
        LocalTime localTime2 = LocalTime.now().withNano(0).withSecond(0);
        System.out.println("Local time with Hour, Minute, Second: " + localTime2);
        System.out.println(localTime2.getHour());
        System.out.println(localTime2.getHour() + "/" + localTime2.getMinute() + "/" + localTime2.getSecond());
        System.out.println("After 20 minutes time will be: " + localTime2.plusMinutes(20));

        System.out.println(Duration.ofDays(2).toHours());
        System.out.println(Duration.between(localDateTime, localDateTime1).toHours());

        System.out.println(localDate);
        System.out.println(Period.between(localDate, localDate1.plusMonths(20)).getMonths());*/

/*        System.out.println((int)numD);
        System.out.println("Rounded values " + Math.round(numD));// * 100.00)/100.00);


       DecimalFormat df = new DecimalFormat("0.000");

        System.out.println(df.format(numD));
        System.out.println(df.format(numF));
        System.out.printf("Are %d soldiers better than %s and %.2f apples?\n", numI, string1, numF);

        System.out.println(Math.pow(numI,3));//power
        System.out.println(Math.sqrt(9)); //root
        System.out.println(Math.max(65,89));
        System.out.println(Math.min(2,69));
        System.out.println(Math.floor(2.6));
        System.out.println(Math.ceil(2.6));
        System.out.println(Math.round(2.51));
        System.out.println(Math.abs(-100));
        System.out.println((int)(Math.random()*100) + 1);
        System.out.println((double)numI);

        for (int i = 0; i < numI; i++){
            System.out.println(string1 + i);
        }

        for (int i = 10; i > numI; i--){
            System.out.println(string1 + i);
        }

        int i = 0;
        while(numI > i){
            System.out.println(i + string1);
            i++;
        }*/

       /* System.out.println("Would you like to play a game? yes/no");
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine().toLowerCase();
        if (key.equals("yes")) {
            System.out.println("Insert number from 1 to 5: ");
            int number = scanner.nextInt();
            if (number < 0 || number > 5) {
                System.out.println("Incorrect input, try again!");
            } else {
                switch (number) {
                    case 1:
                        System.out.println("Hello");
                        break;
                    case 2:
                        System.out.println("World");
                        break;
                    case 3:
                        System.out.println("Are");
                        break;
                    case 4:
                        System.out.println("You");
                        break;
                    case 5:
                        System.out.println("There?");
                        break;
                    default:
                        System.out.println("Tuk - tuk!");
                }
            }
        } else {
            System.out.println("Thank you, have a nice day!");
        }
*/

 //   }
}
