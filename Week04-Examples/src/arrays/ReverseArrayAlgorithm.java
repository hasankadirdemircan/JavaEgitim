package arrays;

public class ReverseArrayAlgorithm {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 5, 7};
        //;Girilen age dizisinin içerçiğini terse çeviriniz

        // input:  age = {12, 4, 5, 2, 5, 7};
        //output:  age = {7, 5, 2, 5, 4, 12};
        System.out.println("dizinin ilk hali");
        for (int number:age) {
            System.out.println(number);
        }

     /*   for (int i=0; i<age.length/2; i++) {
            int ilk = age[i];
            int son = age[age.length-1-i];
            age[i] = son;
            age[age.length-1-i] = ilk;
        }*/
        int temp;
        for (int i=0; i<age.length/2; i++) {
            temp = age[i];
            age[i] = age[age.length-1-i];
            age[age.length-1-i] = temp;
        }
        System.out.println("dizinin son hali");
        for (int number:age) {
            System.out.println(number);
        }
    }
}
