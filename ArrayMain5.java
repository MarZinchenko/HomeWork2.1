//2.2.1

package homework2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMain5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = in.nextInt();
        int[] container = new int[n];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            container[i] = in.nextInt();
        }
        System.out.println("Исходный массив: " + Arrays.toString(container));
    }
}
