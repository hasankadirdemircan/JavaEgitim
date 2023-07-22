package stack_heap;

public class Main {

    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};

        int age = 30;
        age = changeAge(age);
        System.out.println(age);
        changeNumbers(numbers);
        System.out.println("numbers---");

        for(int number : numbers) {
            System.out.println(number);
        }
    }

    public static int changeAge(int age) {
        age = 50;
        return age;
    }

    public static int[] changeNumbers(int [] numbers) {
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = 2;
        }
        return numbers;
    }
}
