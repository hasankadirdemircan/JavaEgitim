package parallel_stream;

import java.util.Arrays;

public class ParallelStreamExample12 {
    public static void main(String[] args) {
        String reduced1 = Arrays.asList('w', 'o', 'l', 'f').stream().reduce("-x-", (String c, Character s) -> "he"+c+s,
                (String s2, String s3) -> s2 + s3);
        System.out.println(reduced1);

        String reduced2 =Arrays.asList('w', 'o', 'l', 'f').parallelStream().reduce("", (String c, Character s) -> c + s,
                (String s2, String s3) -> s2 + s3);
        System.out.println(reduced2);
    }
}
