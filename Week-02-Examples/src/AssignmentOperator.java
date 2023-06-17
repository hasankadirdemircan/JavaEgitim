public class AssignmentOperator {
    public static void main(String[] args) {
        byte byteNumber = 126;
        short shortNumber = 327;
        int intNumber = 9;
        long longNumber = 1200L;
        float floatNumber = 42.8f;
        double doubleNumber = 8.58;
        char character = 'A';
        boolean booleanInformation = true;
        String courseName = "Java";

        long sum = intNumber + longNumber;
        System.out.println("sum : " + sum);
        System.out.println("intNumber line13 : " + intNumber++ );
        System.out.println("intNumber : " + (intNumber +=2));

        // Referans Veri Tipleri (String ile sınırlı):


    }
}

/**
 * += Operatörü: Solda bulunan değere, kendi değerini ekleyerek tekrar soldaki değere atamasını gerçekleştirir.
 * -= Operatörü: Solda atanan değerden, sağdaki değeri çıkararak tekrar solda yer alan değere atama gerçekleştirir.
 * *= Operatörü: Soldaki değeri, sağda yer alan değer ile çarparak tekrar soldaki değere atamasını gerçekleştirir.
 * /= Operatörü: Diğer operatörlerde olduğu gibi soldaki değeri, sağdaki değere bölerek sonucu tekrar soldaki değere atar.
 */
