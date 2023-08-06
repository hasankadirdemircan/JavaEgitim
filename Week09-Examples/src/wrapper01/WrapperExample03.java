package wrapper01;

import java.math.BigDecimal;

public class WrapperExample03 {
    public static void main(String[] args) {
        Integer integer1 = 5;
        Integer integer = Integer.valueOf("10");
        int number1 = 4;
        Integer integer2 = number1;

        //  Integer integer3 = Integer.valueOf("10.3"); //Exception in thread "main" java.lang.NumberFormatException: For input string: "10.3"

        Boolean boolean1 = Boolean.valueOf("tRuE");
        Boolean boolean2 = Boolean.FALSE;
        Boolean boolean3 = Boolean.valueOf(true);
        String tf = "tRuEÖ";
        String tf2 = "true";

        System.out.println(tf.toLowerCase());
        System.out.println(tf.toUpperCase());
        System.out.println(tf.endsWith("Ö"));

        Float flaot1 = Float.valueOf("3.2"); // String -> Wrapper

        Integer integer3 = new Integer(50);
        int int1 = integer3.shortValue();
        int int2 = integer3.intValue();// Wrapper -> primitive

        //parseXXX
        Integer integer4 = new Integer("10");
        int int4 = integer4;
        int int3 = Integer.parseInt("10");


        Integer integer5 = Integer.valueOf("20");
        Integer integer6 = new Integer("25");
        System.out.println(integer6 - integer5);
        BigDecimal bigDecimal = new BigDecimal("20");
        BigDecimal bigDecimal1 = new BigDecimal("25");
        System.out.println(bigDecimal1.subtract(bigDecimal));
    }
}
