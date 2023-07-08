package methods;

public class MethodForLoopExample {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};
       /* System.out.println(square(numbers[0]));
        System.out.println(square(numbers[1]));*/
        MethodForLoopExample methodForLoopExample = new MethodForLoopExample();
        for (int number:numbers) {
            System.out.println(methodForLoopExample.square(number));
        }
    }

    private int square(int number) {
        return number * number;
    }
}
