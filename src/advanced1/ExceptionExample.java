package advanced1;

public class ExceptionExample {
    public static void main(String[] args) {


        try{
            int[] num = {1,2,3,4};
            System.out.println(num[5]);
        } catch (Exception e){
            System.out.println(e);
        } finally {                                 // As option tu put or not
            System.out.println("Hello world");
        }

    }
}
