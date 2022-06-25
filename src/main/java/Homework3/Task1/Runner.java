package Homework3.Task1;

public class Runner extends Cars {

    public static void main(String[] args) {

        Cars[] cars = new Cars[40];

        for(int i = 0; i < 20; i++) {
           cars[i] = CarFactory.lada();
        }

        for(int i = 20; i < 40; i++) {
           cars[i] = CarFactory.toyota();
        }

        for (Cars car : cars) {
            if (car instanceof Lada) {
                Lada lada = (Lada) car;
                lada.breakDown();
            } else {
                Toyota toyota = (Toyota) car;
                toyota.musicOn();
            }
        }
    }
}
