package testobjects;

public class Bd {
    private String name;
    private double size;

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(double size) {
        if (size > 0) {
            this.size = size;
        } else {
            System.out.println("Введенное значение неверное");
        }

    }

    public void delete() {
        System.out.println("База " + name + " размером " + size + " удалена");
    }
}
