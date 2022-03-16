package advanced1;

class Parent{
    protected int num1;
    protected int num2;

    // Custom constructor
    public Parent(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void printInfo(){
        System.out.println("This is parent class");
    }

    public void printValues(){
        System.out.println(num1 + num2);
    }

}

class Child extends Parent{
    public Child(int x, int y){
       super(x,y);
    }
    public void printChildInfo(){
        System.out.println("This is child class");
    }
}

public class IntroClass {
    public static void main(String[] args) {

        Parent parent = new Parent(10,5);
        Child child = new Child(5,20);

        child.printChildInfo();
        child.printInfo();
        child.printValues();
        
        parent.printInfo();
        parent.printValues();

    }
}
