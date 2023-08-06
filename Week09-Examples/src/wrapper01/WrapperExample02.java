package wrapper01;

import interface03.B;
import interface03.C;

public class WrapperExample02 {
    public static void main(String[] args) {
        Boolean b1 = new Boolean("true");
        Boolean b2 = new Boolean("bilge");
        Boolean b3 = new Boolean("tRue");
        Boolean b4 = new Boolean("tRUe");
        Boolean b5 = new Boolean("FalSe");

        System.out.println("----boolean----");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);


        Byte byte1 = new Byte((byte) 5);
        Byte byte2 = new Byte("50");
        //  Byte byte3 = new Byte("bilge"); //error Exception in thread "main" java.lang.NumberFormatException: For input string: "bilge"
        System.out.println("----Byte----");
        System.out.println(byte1);
        System.out.println(byte2);

        Integer integer1 = new Integer(10);
        Integer integer2 = new Integer("15");
        //Integer integer3 = new Integer("mac"); //error Exception in thread "main" java.lang.NumberFormatException: For input string: "mac"
        Integer integerSum = integer1 + integer2;
        int intSum = integer1 + integer2;
        int number1 = 5;
        int number2 = 10;
        Integer intSums = number1 + number2;

        System.out.println("----Integer----");
        System.out.println(integer1);
        System.out.println(integer2);


        Float float1 = new Float(4.4);
        Float float2 = new Float("5.6");
        Float float3 = new Float(4);
        Float float4 = new Float(6.5f);
        float floatPrimitive = 4f;
        // Float float5 = 4.2; error
        Float float5 = 4.2f;

        Float floatSum = float1 + float2;
        System.out.println("----Float----");
        System.out.println(float1);
        System.out.println(float2);
        System.out.println(float3);
        System.out.println(float4);
        System.out.println(float5);
        System.out.println(floatSum);

        Long long1 = new Long(4);
        Long long2 = new Long("6");
        Long longSum = long1 + long2;
        // Long long3 = 5; error
        Long long3 = 5L;
        System.out.println("----Long----");
        System.out.println(long1);
        System.out.println(long2);
        System.out.println(longSum);

        Double double1 = new Double(5.2);
        Double double2 = new Double("6.3");
        double doubleSum = double1 + double2;
        Double double3 = 5.3;
        Double double4 = 5.3D;
        System.out.println("----Double----");
        System.out.println(double1);
        System.out.println(double2);
        System.out.println(doubleSum);
        System.out.println(double3);
        System.out.println(double4);

        Character character1 = new Character((char) 65);
        Character character2 = new Character((char) 97); //Büyük harf olan ASCII'Ye 32 eklediğinde küçük harfi bulursun
        Character character3 = new Character('A'); //character'ler tek tırnak ile belirtilir. (')
        Character character4 = new Character('a');
        char char1 = character1;

        System.out.println("----Character----");
        System.out.println(character1);
        System.out.println(character2);
        System.out.println(character3);
        System.out.println(character4);
        System.out.println(char1);

    }
}
