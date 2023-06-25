package arrays;

public class ArraySquareExample {
    public static void main(String[] args) {
        int[] numbers = {12, 4, 5, 2, 5, 7};

        for(int i=0; i<numbers.length; i++) {
            numbers[i] = numbers[i] * numbers[i];
        }



        System.out.println("for bitti");

        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for(int element:numbers) {
            System.out.println(element);
        }

        //input {12, 4, 5, 2, 5, 7};
        //output {144, 16, 25, 4, 25, 49};
    }
}
