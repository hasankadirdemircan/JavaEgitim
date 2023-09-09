package optional;

import java.util.Optional;

public class OptionalExample07 {
    public static void main(String[] args) {

    }
    //bad approach
    private static void threeDigit(Optional<Integer> optional) {
        if (optional.isPresent()) {
            Integer num = optional.get();
            String string = "" + num;
            if (string.length() == 3)
                System.out.println(string);
        }
    }

    //good approach
    private static void threeDigitV2(Optional<Integer> optional){
        optional.map(n -> "" + n)
                .filter(s -> s.length() == 3)
                .ifPresent(System.out::println);
    }
}
