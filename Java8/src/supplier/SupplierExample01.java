package supplier;

import java.util.function.Supplier;

public class SupplierExample01 {
    public static void main(String[] args) {
        Supplier<String>  supplier01 = () -> "Supplier Example";
     /*   Supplier<String>  supplier02 = () -> {
            return "Supplier Example";
        };*/

        System.out.println(supplier01.get());
  //      System.out.println();
    }
}
