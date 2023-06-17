package if_statements;

public class ReturnExample01 {
    public static void main(String[] args) {
        System.out.println(findFirst());
    }

    public static int findFirst() {
        for(int i=0; i<10; i++) {
            if(i==4) {
                return 4;
            }
        }
        return -1;
    }
}
