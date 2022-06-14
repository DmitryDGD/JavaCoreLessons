package Homework2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        for (int i = 0; i < arr.length; i += 2) {
               arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
