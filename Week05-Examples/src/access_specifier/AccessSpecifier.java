package access_specifier;


import access_specifier_2.AccessSpecifier2;

public class AccessSpecifier {
    public static void main(String[] args) {

        AccessSpecifier2 accessSpecifier2 = new AccessSpecifier2();
        System.out.println("sum : " +accessSpecifier2.sum(3, 5) );
        System.out.println("sum static" + AccessSpecifier2.sum2(3, 5));
        AccessSpecifier2.sum2(3, 5);

       // AccessSpecifier2.sum3(3, 5) veya accessSpecifier2.sum3(3,5) -> compile error because of PROTECTED.
        //AccessSpecifierDefault.sum(3, 5 ) compile error because of not static method
        AccessSpecifierDefault accessSpecifierDefault = new AccessSpecifierDefault();
        accessSpecifierDefault.sum(3, 5);
        AccessSpecifier accessSpecifier = new AccessSpecifier();
        accessSpecifier.sum(3, 5);
        accessSpecifier.sum2(3, 5);

    }

    int sum(int number1, int number2) {
        return number1 + number2;
    }

    private int sum2(int number1, int number2) {
        return number1 + number2;
    }
}
