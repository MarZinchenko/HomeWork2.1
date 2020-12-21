package homework2.arrays;

import java.util.Scanner;

public class ArrayMain9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = in.nextInt();
        int[] container = new int[n];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            container[i] = in.nextInt();
        }
        int min1, min2, m = container.length;
        min1 = container[0];

        for (int i = 1; i < m; i++)
        {
            if (container[i] < min1) {
                min1 = container[i];
            }
        }
        System.out.println("Первый минимальный элемент массива: " + min1);
        min2 = container[0];
        for (int i = 1; i < m; i++)
        {
            if (container[i] > min1 && container[i] < min2)
            {
                min2 = container[i];
            }
        }
        System.out.println("Второй минимальный элемент массива: " + min2);
    }
}
