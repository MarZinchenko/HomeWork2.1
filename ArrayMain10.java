//2.4.5

package homework2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMain10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = in.nextInt();
        int[] container = new int[n];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            container[i] = in.nextInt();
        }
        int i = 0;
        int j = i;
        int begin = 10;
        int end = 30;

        for (; i < n; i++)
        {
            if (container[i] < begin || container[i] > end)
                container[i - j] = container[i];
            else
                j++;
        }
        for (i = n - j; i < n; i++) {
            container[i] = 0;
        }
        System.out.println("Сжатый массив: ");
        System.out.println(Arrays.toString(container));
    }

}
