package advanced1.carpet;

public class Floor {

    //Fields
    private double width;
    private double length;

    public Floor(double width, double length){ //Constructor

        if(width < 0){
            this.width = 0;
        } else {
            this.width = width;
        }
        if(length < 0) this.length = 0; // will work if we have one line of code at each part of if and else
        else this.length = length; // NOT recommended practice

    }

    public double getArea(){
        return (width * length);
    }
}
