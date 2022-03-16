package advanced1;
interface Bug{
    public void bugSound();
    public void bugSize();
}

interface Location{
    public void location();
}


class Ant implements Bug, Location{

    public void bugSound(){
        System.out.println("Tss");
    }

    public void bugSize(){
        System.out.println("Small");
    }

    public void location(){
        System.out.println("Europa");
    }

}


public class InterfaceExample {
    public static void main(String[] args) {

        Ant ant1 = new Ant();
        ant1.bugSound();
        ant1.bugSize();
        ant1.location();

    }
}