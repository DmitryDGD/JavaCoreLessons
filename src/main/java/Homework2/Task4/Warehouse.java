package Homework2.Task4;

public class Warehouse {
    static int vodka = 10000;

    public static int getVodka(int countVodka) {
        if (countVodka < vodka) {
            vodka -= countVodka;
        } else {
            System.out.println("Водки больше нет!");
        }
        System.out.println("На складе осталось " + vodka + " водки" + "\n");
        return countVodka;
    }
}
