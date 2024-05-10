package testobjects;

public class Bus {
    public int number;
    public String way;
    public String time;

    public void go() {
        System.out.println("Автобус уехал");
    }

    public void come() {
        System.out.println("Приехал автобус номер " + number);
    }
}
