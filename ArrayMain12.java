//правильный вариант! вместо ArrayMain3, ArrayMain4, ArrayMain5,
//2.1

package homework2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMain12 {
    public static void main(String[] args) {
    int[] container = arrayFromConsole();
        System.out.println(Arrays.toString(container));
        System.out.println(Arrays.toString(getEverySecondElement(container)));
        System.out.println(Arrays.toString(getReversElements(container)));
}
    public static int[] arrayFromConsole() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int[] container = new int[n];
        for (int i = 0; i < container.length; i++) {
            container[i] = in.nextInt();
        }
        System.out.print("Исходный массив: ");
        return container;
    }
    public static int[] getEverySecondElement(int[] n) {
        System.out.print("Каждый второй элемент массива: ");
        int[] container = new int[n.length/2];
        int j = 0;
        for (int i = 1; i < n.length; i+=2) {
            container[j] = n[i];
            j++;
        }
        return container;
    }
    public static int[] getReversElements(int[] n){
        System.out.print("Элементы массива в обратном порядке: ");
        int[] container = new int[n.length];
        int j = 0;
        for (int i = n.length-1; i >= 0 ; i--) {
            container[j] = n[i];
            j++;
        }
        return container;
    }
}