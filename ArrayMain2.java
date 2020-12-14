//2.2.2

package homeWork2.arrays;

import java.util.Scanner;

public class ArrayMain2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = in.nextInt();
        int[] container = new int[n];
        System.out.println("Исходный массив: ");

        for (int m = 0; m < n; m++) {
            container[m] = (int) (Math.random() * 20);
            System.out.print(container[m] + "\t");
        }
        System.out.println("\nЭлементы массива с четными индексами: ");
        for (int m = 0; m < container.length; m += 2) {
            System.out.println(container[m] + "\t");
        }
            int max = container[0];

            for (int m = 1; m < container.length; m++) {
                if (container[m] > max) {
                    max = container[m];
                }
            }
            System.out.println("Максимальный элемент в массиве: " + max);
    }
}
