package advanced1;

enum Level{
    LOW, MEDIUM, HIGH
}

public class EnumExample {
    public static void main(String[] args) {

        Level myLevel = Level.LOW;

        switch (myLevel){
            case LOW:
                System.out.println("Low Level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High leve");
                break;
        }
    }
}
