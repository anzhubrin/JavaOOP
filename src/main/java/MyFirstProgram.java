import testobjects.Bd;
import testobjects.Bus;
import testobjects.Dog;

public class MyFirstProgram {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.call();

        Bus bus = new Bus();
        bus.number = 448;
        bus.come();

        Bd base = new Bd();
        base.size = 5.5;
        base.name = "Dump";
        base.delete();

    }

}
