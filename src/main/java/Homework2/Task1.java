package Homework2;

public class Task1 {
    public static void main(String[] args) {
        double increment = 0.01123;
        double result = 0;
        int count = 0;
        do {
            if (increment < 0) { break; }
            result += increment;
            count++;
        } while(result <= 1000000);
        System.out.println("Число итераций: " + count);
    }
}