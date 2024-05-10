package testobjects;

public class Bd {
    public String name;
    public double size;

    public void create() {
        System.out.println("База создана с именем " + name);
    }

    public void delete() {
        System.out.println("База " + name + " размером " + size + " удалена");
    }
}
