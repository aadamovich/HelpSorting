package Classworks;

public class Geometry {
    public static void main(String[] args) {
        Rectangular rectangular = new Rectangular(10, 20);
        rectangular.perimeter();
        rectangular.area();

        Square square = new Square(5);
        square.area();
        square.perimeter();
    }
}
