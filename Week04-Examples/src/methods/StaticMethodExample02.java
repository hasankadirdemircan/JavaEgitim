package methods;

import protected_example.ProtectedMethodExample;

public class StaticMethodExample02 {
    public static void main(String[] args) {
        StaticMethodExample02 staticMethodExample02 = new StaticMethodExample02();
        staticMethodExample02.multipy(3, 5);

      /*  ProtectedMethodExample protectedMethodExample = new ProtectedMethodExample();
        protectedMethodExample.su*/
        DefaultMethodExample defaultMethodExample = new DefaultMethodExample();
        defaultMethodExample.sum(3,5);
    }
    public static int divide(int number1, int number2) {
        return number1 / number2;
    }

    public int multipy(int number1, int number2) {
        return number1 * number2;
    }
}
