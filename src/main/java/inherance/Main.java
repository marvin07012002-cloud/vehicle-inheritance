package inherance;

public class Main {

    public static void main(String[] args) {

        Moped slowRide = new Moped("Yellow",2,0,2);
        Car benz = new Car("Mate Black",5,4,3);
        SemiTruck lexus600 = new SemiTruck("Grey",8,8,9);
        Hovercraft iDontKnow = new Hovercraft("red",99,34,34);

        slowRide.setColor("Black");

    }
}
