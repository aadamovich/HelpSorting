public class Operators {
    public static void main(String[] args) {

        // Math operators (+ - * /)

        // ASSIGNMENT OPERATORS =, +=, -=, *=, /=
        int a = 50;
        a /= 10;
       // a = a / 10;
        System.out.println(a);

        // INCREMENTATION OPERATORS
        //Post - incrementation

        int num = 10;
        num++;
        System.out.println("num = " + num);
        System.out.println("num = " + num);

        // pre-incrementation
        int num2 = 20;
        System.out.println("++num2 = " + ++num2);

// Decrementation
        int num3 = 10;
        num3--;
        System.out.println("num = " + num3);
        System.out.println("num = " + num3);

        //Add or substract one to variable
        int vari  = 10;
        vari += 1;
        vari++;
        ++vari;
        vari = vari +1;

// RELATIONAL OPERATORS
        //EQUALITY ==
        int x = 10;
        int z = 10;
        System.out.println("Equality - " + (x == z)); //is x equal to z?

        //Inequality !=
        System.out.println("Inequality - " + (x != z));// is x not equal to z?

        // Greater than > and greater than or equal to >=
        System.out.println(x > z );
        System.out.println(x >= z);

        // Less than < and less than or equal to <=
        System.out.println(x < z);
        System.out.println(x <= z);

        // && - conjunction accepts (logical )
        // LOGICAL OPERATORS
        // Logical AND - &&

        boolean mood = true;
        boolean weather = true;
        System.out.println("Logical AND - " +  (mood && weather));
        System.out.println(10 >= 9 && 11<= 12);

        // Logical OR - ||
        // Disjunction

        boolean sale = false;
        boolean rich = true;
        System.out.println("Can we buy new shoes - " + (sale || rich));










    }
}
