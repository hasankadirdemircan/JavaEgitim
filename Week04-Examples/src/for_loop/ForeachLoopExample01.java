package for_loop;

public class ForeachLoopExample01 {
    public static void main(String[] args) {
        int array[]={12,23,44,56,78};
        int number1 = array[0];
        for (int number:array) {
            System.out.println(number);
        }
    }
}
