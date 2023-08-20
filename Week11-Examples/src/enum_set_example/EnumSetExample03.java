package enum_set_example;

import java.util.EnumSet;

public class EnumSetExample03 {
    public static void main(String[] args) {
        // Using of() with a single parameter
        EnumSet<Size> sizes1 = EnumSet.of(Size.MEDIUM);
        System.out.println("EnumSet1: " + sizes1);

        EnumSet<Size> sizes2 = EnumSet.of(Size.SMALL, Size.LARGE);
        System.out.println("EnumSet2: " + sizes2);

        EnumSet<Size> size3 = EnumSet.noneOf(Size.class);
        size3.add(Size.SMALL);
        size3.add(Size.LARGE);
        System.out.println();
    }
}
