package thread04;

public class SumThread extends Thread {
    private int[] numbers;
    private int sum;

    public SumThread(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        System.out.println("run method length : " + numbers.length);
        System.out.println("run method 0 index: " + numbers[0]);
        for(int number : numbers) {
            sum += number; // sum = sum + number
        }
    }

    public int getSum() {
        return sum;
    }
}
