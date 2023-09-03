package supplier;

import java.util.Optional;

public class SupplierExample05 {
    public static void main(String[] args) {
        String name = findNameById(1L).orElseThrow(() -> new RuntimeException("errrr"));
        String name2 = findNameById(2L).orElseGet(SupplierExample05::printEmpty);
        String name3 = findNameById(2L).orElse("test");

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
    }

    private static Optional<String> findNameById(Long id) {
        String name = null;
        if(id == 1L) {
            name = "java8";
        }
        return Optional.ofNullable(name);
    }

    private static String printEmpty() {
        return "bilgeAdam";
    }
}
