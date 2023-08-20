package enum_set_example;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetExample05 {
    public static void main(String[] args) {
        EnumSet<Size> sizes = EnumSet.allOf(Size.class);

        Iterator<Size> iterate = sizes.iterator();

        System.out.println("EnumSet: ");
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        System.out.println();
        System.out.println("for-each");
        for (Size size : sizes) {
            System.out.print(size);
            System.out.print(", ");
        }

    }
}
