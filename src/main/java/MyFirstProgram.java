import testobjects.Bd;
import testobjects.Bus;
import testobjects.Dog;

public class MyFirstProgram {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.call();

        Bus bus = new Bus();
        bus.setNumber(448);
        bus.come();

        Bd base = new Bd();
        base.setSize(5.5);
        base.setName("Dump");
        base.delete();

    }

}
