package advanced1;

abstract class Animal1{

    // New abstarct method

   public abstract void animalSound();
    public void sleep(){
        System.out.println("Zzzzzzzzzz");
    }

}
class Cat extends Animal1{
    public void animalSound(){
        System.out.println("Miao!");

    }
}


public class AbstractClassExample {
    public static void main(String[] args) {

        // Crete Animal1 class object
        //  Animal1 animal1 = new Animal1(); you can't do like usual

        Cat cat = new Cat();
        cat.sleep();
        cat.animalSound();
    }
}
