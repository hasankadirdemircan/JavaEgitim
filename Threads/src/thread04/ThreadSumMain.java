package thread04;

import java.util.Arrays;
import java.util.Random;

public class ThreadSumMain {
    public static void main(String[] args) {
        int[] numbers = generateNumbersArray(100);
        int[] firstHalf = Arrays.copyOfRange(numbers, 0, numbers.length/2);
        int[] secondHalf = Arrays.copyOfRange(numbers, numbers.length/2, numbers.length);

        System.out.println("firstHalf : " + firstHalf[0]);
        System.out.println("secondHalf : " + secondHalf[0]);
        SumThread firstThread = new SumThread(firstHalf);
        SumThread secondThread = new SumThread(secondHalf);

        firstThread.start();
        secondThread.start();

        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            //loglama yaparım. Thread
            throw new RuntimeException(e);
        }

        int totalSum = firstThread.getSum() + secondThread.getSum();
        System.out.println("firstThread.getSum() : " + firstThread.getSum());
        System.out.println("secondThread.getSum() : " + secondThread.getSum());
        System.out.println("Sum : " + totalSum);

    }

    private static int[] generateNumbersArray(int size) {
        int[] numbers = new int[size];
        Random random = new Random();
        for(int i=0; i<size; i++) {
            numbers[i] = random.nextInt(100); //0-99
        }
        return numbers;
    }
}
