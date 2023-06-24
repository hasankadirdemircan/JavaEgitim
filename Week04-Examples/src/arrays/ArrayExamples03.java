package arrays;

public class ArrayExamples03 {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 5};


        // access each array elements
        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);

        System.out.println("with for loop printing");
        int arrayLength = age.length;
        for(int i=0; i < arrayLength; i++) {
            System.out.println(age[i]);
        }
       //age[5] = 29; //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5

        System.out.println("with foreach loop printing");
       // for(dataType variableName:array)
        for(int element:age) {
            System.out.println(element);
        }
    }
}
