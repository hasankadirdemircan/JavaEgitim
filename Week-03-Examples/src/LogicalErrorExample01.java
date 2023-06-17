public class LogicalErrorExample01 {
    public static void main(String[] args) {
        int result1 = 5 + 4 * 3/2;
        int result2 = (5 + 4) * 3/2;
        int result3 = (5 + 4) * (3/2);
        int result4 = (5 + (4 * 3)) / 2;
        System.out.println(("result1:" + result1 +
                " result12:" + result2 +
                " result13:" + result3 +
                " result14:" + result4));
    }
}


