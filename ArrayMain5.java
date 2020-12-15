//2.2.1

package homework2.arrays;

import java.util.Scanner;

public class ArrayMain5 {
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
    }
}
