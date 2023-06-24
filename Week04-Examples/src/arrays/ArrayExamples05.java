package arrays;

public class ArrayExamples05 {
    public static void main(String[] args) {
           /*
        2, -9, 0, 5, 12, -25, 22, 9, 8, 12 sayılarını bir dizi içerisine tanımlayınız.
        Daha sonra for/foreach kullanarak toplamını bulup ekrana yazdıran ve
        sonrasında ise ortalamasını da hesaplayan ekrana yazdıran java kodunu yazınız.
         */

        int[] array = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        //double sum = 0;
        int sum = 0;
        double avg = 0;

        for (int num : array) {
            sum += num;
        }

       /* for(int i=0; i<array.length; i++) {
            sum +=array[i];
        }*/
        avg = (double) sum / array.length;
        System.out.println("Dizi elemanlari toplami : " + sum);
        System.out.println("Dizi elemanlari ortalaması : " + avg);
    }

}
