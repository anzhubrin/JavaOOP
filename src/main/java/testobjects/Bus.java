package testobjects;

public class Bus {
    private int number;
    private String way;
    private String time;

    public void setNumber(int number) {
        this.number = number;
    }

    public void come() {
        System.out.println("Приехал автобус номер " + number);
    }
}
