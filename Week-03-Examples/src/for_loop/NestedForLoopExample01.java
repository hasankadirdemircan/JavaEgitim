package for_loop;

public class NestedForLoopExample01 {
    public static void main(String[] args) {
        for(int i=0; i<=9; i++) {
            System.out.println("birinci for ve i' nin değeri : " + i);
            for (int j=0; j<=i; j++) {
                System.out.println("ikinci for ve j' nin değeri : " + j);
            }
        }

    }
}
