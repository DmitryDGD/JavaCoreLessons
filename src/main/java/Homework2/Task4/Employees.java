package Homework2.Task4;

public class Employees {
    int countRuinVodka = 0;
    String name;

    public void pickVodka(int countVodka) {
        countRuinVodka += countVodka;
        System.out.println("Ура, я (" + name + ") испортил водку!");
        Warehouse.getVodka(countVodka);
    }

    public Employees(String name) {
        this.name = name;
    }
}
