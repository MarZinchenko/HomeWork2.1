//2.4.6

package homework2.arrays;

import java.util.Scanner;

public class ArrayMain11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = in.nextInt();
        int[] container = new int[n];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            container[i] = in.nextInt();
        }
        int sum = 0;
        for (int j : container) {
            sum = sum + j;
        }
        System.out.println("Сумма цифр массива: " + sum);
    }
}
