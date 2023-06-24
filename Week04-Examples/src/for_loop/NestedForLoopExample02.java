package for_loop;

public class NestedForLoopExample02 {
    public static void main(String[] args) {
        int number = 5;

        for(int i=1; i<=number; i++) {
            System.out.println();
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

        }
    }
}
