package optional;

import java.util.Optional;

public class OptionalExample05 {
    public static void main(String[] args) {
        Optional<String> string = Optional.ofNullable(null); //Optional.empty
        String name = null;
        System.out.println(name);
       // int count = name.length(); Null bir değer üzerinde işlem yapılmamalı. Nullpointer exception alınır.
        System.out.println(string.map(String::length).orElse(-1));
      //  System.out.println(string.map(String::length)
        //                .orElseThrow(() -> new RuntimeException("error runtime")));
                       // .orElseThrow(ArithmeticException::new);
                //.orElseThrow(MyServiceException::new));

        System.out.println(string.map(String::length).orElseGet(() -> writeError()));
        string.map(String::length).orElse(writeError());
    }
    static Integer writeError() {
        System.out.println("hata meydaana geldi.");
        return 1;
    }
}
