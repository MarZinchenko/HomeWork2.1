//2.2.2

package homework2.arrays;

import java.util.Scanner;

public class ArrayMain4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = in.nextInt();
        int[] container = new int[n];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            container[i] = in.nextInt();
        }
        System.out.print("\nКаждый второй элемент массива: ");
        for (int i  = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(container[i] + "\t");
            }
        }
    }
}
