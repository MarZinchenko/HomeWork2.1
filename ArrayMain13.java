//правильный вариант! вместо ArrayMain6, ArrayMain1, ArrayMain7, ArrayMain2, ArrayMain9, ArrayMain10, ArrayMain11
//2.3 и 2.4

package homework2.arrays;

import java.util.Arrays;

import static homework2.arrays.ArrayMain12.arrayFromConsole;

public class ArrayMain13 {
    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        System.out.println(getSumElements(container));
        System.out.println(getMaxValue(container));
        System.out.println(Arrays.toString(compressArray(container, 10, 30)));
        System.out.println(getSum(container));
    }

    public static int getSumElements(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] >= 0 && n[i] % 2 == 0) {
                sum += n[i];
            }
            System.out.print(n[i] + " ");
        }
        System.out.print("\nСумма четных положительных элементов массива: ");
        return sum;
    }

    public static int getMaxValue(int[] n) {
        int max = n[0];
        for (int i = 0; i < n.length; i += 2) {
            if (n[i] > max) {
                max = n[i];
            }
        }
        System.out.print("Максимальный элемент массива с четным индексом: ");
        return max;
    }

    public static void getElementsLessThanAverage(int[] n) {
        int sum = 0;
        for (int i = 1; i < n.length; i++) {
            sum += n[i];
        }
        int average = sum / n.length;
        System.out.println("Элементы массива, которые меньше среднего арифметического: ");
        for (int j : n) {
            if (j < average) {
                System.out.print(j + "  ");
            }
        }
    }

    public static void getTwoMinElements(int[] n) {
        int min1, min2, m = n.length;
        min1 = n[0];

        for (int i = 1; i < m; i++)
        {
            if (n[i] < min1) {
                min1 = n[i];
            }
        }
        System.out.println("Первый минимальный элемент массива: " + min1);
        min2 = n[0];
        for (int i = 1; i < m; i++)
        {
            if (n[i] > min1 && n[i] < min2)
            {
                min2 = n[i];
            }
        }
        System.out.println("Второй минимальный элемент массива: " + min2);
    }

    public static int[] compressArray(int[] n, int begin, int end) {
        int i = 0;
        int j = i;
        for (; i < n.length; i++) {
            if (n[i] < begin || n[i] > end)
                n[i - j] = n[i];
            else
                j++;
        }
        for (i = n.length - j; i < n.length; i++) {
            n[i] = 0;
        }
        System.out.print("Сжатый массив: ");
        return n;
    }

    public static int getSum(int[] n){
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
        }
        System.out.print("Сумма цифр массива: ");
        return sum;
    }
}