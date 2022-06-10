import java.util.Arrays;

public class Homework1 {
    public static void main(String[] args) {

        // Базовый уровень
        System.out.println("Задача №1:\n" + task1());
        System.out.println("Задача №2:\n" + "ИМТ = " + task2(1.77, 73) + "\n");
        System.out.println("Задача №3:\n" + task3());

        // Продвинутый уровень
        System.out.println("Задача №4:\n" + task4() + "\n");
        System.out.println("Задача №5:\n" + "(a+b)^2 =" + task5() + "\n");
        System.out.println("Задача №6:\n" + Arrays.toString(task6()) + "\n");
        System.out.println("Задача №7:\n" + task7());







    }
    // Базовый уровень
    // Задача №1
    private static String task1() {
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        String result = hi.trim() + world.toLowerCase() + newLine;
        return(result.repeat(3));
    }

    // Задача №2
    private static Double task2(double height, double weight) {
        return (weight / (height * height));
    }

    // Задача №3
    private static String task3() {
        char[] letters = new char[]{'a', 'b', 'c', 'd', 'e'};
        String result1 = new String(letters);
        letters[3] = 'h';
        String result2 = new String(letters);
        return(result1 + "\n" + result2 + "\n");
    }


    // Продвинутый уровень
    // Задача №1
    private static String task4() {
        String str = "234";
        String str2 = "some_text";
        int number = Integer.parseInt(str);
        return("Число = " + number + "\n" + "длина строки = " + str2.length());
    }

    // Задача №2
    private static int task5() {
        int a = 3;
        int b = 5;
        return (int) Math.pow((a+b), 2);
    }

    // Задача №3
    private static int[] task6() {
        int[] arr1 = new int[]{1,2,5,7,10};
        int[] arr2 = new int[]{2,3,2,17,15};
        int[] arrResult = new int[arr1.length + arr2.length + 5];

        // Знаю что стримом проще это сделать, но не помню как это делается через стрим, не стал из гугла код копирвоать
        int count = 0;
        for(int i = 0; i<arr1.length; i++) {
            arrResult[i] = arr1[i];
            count++;
        }
        for(int j = 0; j<arr2.length; j++) {
            arrResult[count++] = arr2[j];
        }
        // знаю что это очень криво, но уже не соображаю как тут лучше сделать можно
        int x = 0;
        for(int f = count; f<arrResult.length; f++) {
            arrResult[count++] = arr1[x] * arr2[x];
            x++;
        }

    return(arrResult);
    }

    // Задача № 4
    private static String task7() {
        String str = "Hello world!";
        String strRepl = str.replaceAll("l", "r").toUpperCase();
        return(strRepl.substring(0,7));
    }


}
