//2.4.1 Сумма четных положительных элементов массива

package homeWork2.arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        int[] container = {1, 2, 3, 4, 5, 6};
        int sum = 0;

        for (int i : container)
            if ((i > 0) && (i % 2 == 0)) {
                sum += i;
            }
        System.out.print("Сумма четных положительных элементов массива: " + sum);
    }
}