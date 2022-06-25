package Homework3.Task1;

public class CarFactory {

    public static Cars toyota() {
        return new Toyota();
    }
    public static Cars lada() {
        return new Lada();
    }

}
