package testobjects;

public class Rex extends Dog {

    private final String name = "Rex";
    private final int age = 2;


    @Override
    public void call() {
        printCall("Собаку зовут " + name + " и ей " + age + " года!");
    }

    private void printCall(String str) {
        System.out.println(str);
    }
}
