package testobjects;

public class Dog {
    private final String name = "Sharik";
    private final int age = 3;

    public void call() {
        printCall("Собаку зовут " + name + " и ей " + age + " года!");
    }

    private void printCall(String str) {
        System.out.println(str);
    }

}
