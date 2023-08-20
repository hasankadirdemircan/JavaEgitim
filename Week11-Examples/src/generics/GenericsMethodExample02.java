package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMethodExample02 {
    public static void main(String[] args) {
        GenericsMethod2 genericsMethod2 = new GenericsMethod2();
        genericsMethod2.genericsMethod("hello");
        //genericsMethod2.<String>genericsMethod("Java Programming"); Kötü yaklaşım.
        genericsMethod2.genericsMethod(25);
    }
}
