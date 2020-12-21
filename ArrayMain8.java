package homework2.arrays;

import java.util.Scanner;

public class ArrayMain8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = in.nextInt();
        int[] container = new int[n];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            container[i] = in.nextInt();
        }
        int element1 = container[0];
        for (int i = 0; i < n; i++) {
            if (container[i] < element1) {
                element1 = container[i];
                System.out.println("Первый минимальный элемент массива: " + element1);
            }
        }
        int element2 = container[0];
        for (int i = 0; i < n; i++) {
            if (i != element1 && container[i] < container[element2]) {
                element2 = i;
                System.out.println("Второй минимальный элемент массива: " + element2);
            }
        }
    }
}