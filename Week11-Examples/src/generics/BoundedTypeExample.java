package generics;

public class BoundedTypeExample {
    public static <T extends Number> void findMinMax(T[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        T min = array[0];
        T max = array[0];
        for (T element : array) {
            if (element.doubleValue() < min.doubleValue()) {
                min = element;
            }
            if (element.doubleValue() > max.doubleValue()) {
                max = element;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
    public static void main(String[] args) {
        Integer[] intArray = {3, 7, 1, 9, 5};
        Double[] doubleArray = {3.5, 7.2, 1.8, 9.9, 5.1};

        System.out.println("Integer array:");
        findMinMax(intArray);

        System.out.println("Double array:");
        findMinMax(doubleArray);
    }
}