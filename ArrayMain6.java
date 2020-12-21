//2.3

package homework2.arrays;

public class ArrayMain6 {
    public static void main(String[] args) {
        arrayRandom(5, 100);
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] container = new int[size];
        System.out.println("Элементы массива: ");
        for (maxValueExclusion = 0; maxValueExclusion < size; maxValueExclusion++) {
            container[maxValueExclusion] = (int) (Math.random() * 100);
            System.out.print(container[maxValueExclusion] + "\t");
        }
        return container;
    }
}
