//2.2.3

package homeWork2.arrays;

import java.util.Scanner;

public class ArrayMain3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int number = s.nextInt();
        int[] a = new int[number];

        System.out.println("Введите элементы: ");
        for (int i = number; i > 0; i--) {
            a[i-1] = s.nextInt();
        }
        System.out.println("Элементы массива в обратном порядке: ");
        for (int i : a) {
            System.out.println(i);
        }
    }
}
