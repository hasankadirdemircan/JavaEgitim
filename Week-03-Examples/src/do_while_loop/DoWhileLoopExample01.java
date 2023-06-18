package do_while_loop;

public class DoWhileLoopExample01 {
    public static void main(String[] args) {
        int startValue = 0;

        do {
            System.out.println("do keyword'ün içerisindeyim. startValue : " + startValue);
            startValue++;
        }while (startValue <= 5);
    }
}
