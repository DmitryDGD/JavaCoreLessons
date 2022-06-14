package Homework1;

public class Task4 {
    public static void main(String[] args) {
        String str = "Hello world!";
        String strRepl = str.replaceAll("l", "r").toUpperCase();
        System.out.println("Задача №7:\n" + strRepl.substring(0,7));
    }
}
