package Homework1;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
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
        System.out.println("Задача №6:\n" + Arrays.toString(arrResult) + "\n");
    }
}
