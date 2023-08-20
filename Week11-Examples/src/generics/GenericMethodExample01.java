package generics;

import java.util.Objects;
import java.util.function.Function;

public class GenericMethodExample01 {
    public static void main(String[] args) {
        // int[] intArray = {1, 2, 3, 4}; primitive type kullanamayız. Generics için. Wrapper olmalı.
        Integer[] intArray = {1, 2, 3, 4};
        Double[] doubleArray = {1.1, 2.1, 3.1};
        String[] stringArray = {"Ali", "Veli", "Mehmet"};

        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);

        System.out.println("İkinci Generics");
        printArray2(intArray);
        printArray2(doubleArray);
        printArray2(stringArray);
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element + " ");
        }
    }

    public static <T> void calculate(T data1, T data2) {
        System.out.println(data1.equals(data2));
    }

    public static <E> void printArray2(E[] elements) {
        for (E element : elements) {
            System.out.println(element);
        }
        System.out.println();
    }
}