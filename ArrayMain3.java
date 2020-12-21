//2.2.3

package homework2.arrays;

import java.util.Scanner;

public class ArrayMain3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int number = in.nextInt();
        int[] a = new int[number];

        System.out.println("Введите элементы: ");
        for (int i = number; i > 0; i--) {
            a[i-1] = in.nextInt();
        }
        System.out.println("Элементы массива в обратном порядке: ");
        for (int i : a) {
            System.out.println(i);
        }
    }
}
