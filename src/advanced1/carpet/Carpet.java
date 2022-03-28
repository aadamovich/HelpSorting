package advanced1.carpet;

public class Carpet {

    //Field
    private double price;

    //Constructor
    public Carpet (double price){

/*        if(price < 0){
            this.price = 0;
        } else {
            this.price = price;
        }*/
        this.price = (price < 0) ? 0 : price; // Use when you are assigning some value by using if / else statement with one line of command
    }
    public double getPrice(){
        return price;
    }
}
