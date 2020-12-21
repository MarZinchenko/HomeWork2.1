//2.4.3

package homework2.arrays;

import java.util.Scanner;

public class ArrayMain7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = in.nextInt();
        int[] container = new int[n];
        System.out.println("Введите элементы массива: ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            container[i] = in.nextInt();
            sum += container[i];
        }
        int average = sum / n;
        System.out.println("Элементы массива, которые меньше среднего арифметического: ");

        for (int j : container) {
            if (j < average) {
                System.out.println(j);
            }
        }
    }
}

