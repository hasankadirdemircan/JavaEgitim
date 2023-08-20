package enum_set_example;

import java.util.EnumSet;

public class EnumSetExample01 {
    public static void main(String[] args) {
        EnumSet<Size> sizes = EnumSet.allOf(Size.class);
        System.out.println("EnumSet: " + sizes);


        EnumSet<Size> sizes1 = EnumSet.noneOf(Size.class);
        System.out.println("EnumSet1: " + sizes1);
        sizes1.add(Size.SMALL);
    }
}
