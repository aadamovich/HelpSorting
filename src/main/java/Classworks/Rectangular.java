package Classworks;

class Rectangular{
    protected float length;
    protected float width;

    public void area(){
        System.out.println("Area: " + length * width);
    }
    public void perimeter(){
        System.out.println("Perimeter: " + 2 * (length + width));
    }
    public Rectangular(float length, float width){
        this.width = width;
        this.length = length;
    }
}

class Square extends Rectangular{

    private float side;

    public Square(float side){
        super(side,side);
        this.side = side;
    }

}


