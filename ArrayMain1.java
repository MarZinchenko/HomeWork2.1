//2.4.1 Сумма четных положительных элементов массива

package homework2.arrays;

import java.util.Scanner;

public class ArrayMain1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = in.nextInt();
        int[] container = new int[n];
        System.out.println("Введите элементы массива: ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            container[i] = in.nextInt();
        }
        for (int i : container)
            if ((i > 0) && (i % 2 == 0)) {
                sum += i;
            }
        System.out.println("\nСумма четных положительных элементов массива: " + sum);
    }
}