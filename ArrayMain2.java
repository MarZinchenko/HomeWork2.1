//2.4.2

package homework2.arrays;

import java.util.Scanner;

public class ArrayMain2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = in.nextInt();
        int[] container = new int[n];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            container[i] = in.nextInt();
        }

        int max = container[0];

        for (int m = 0; m < container.length; m += 2) {
            if (container[m] > max) {
                max = container[m];
            }
        }
        System.out.println("Максимальный элемент массива с четным индексом: " + max);
    }
}
