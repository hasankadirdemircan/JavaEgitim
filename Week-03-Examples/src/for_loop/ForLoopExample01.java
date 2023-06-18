package for_loop;

public class ForLoopExample01 {
    public static void main(String[] args) {
        System.out.println("while döngüsü başlıyor.");
        int startValue = 0;
        while(startValue <= 10) {
            System.out.println(startValue);
            startValue++;
        }
        System.out.println("while döngüsü bitti.");

        System.out.println("for döngüsü başlıyor.");

        for (int i=0; i<=10; i++) {
            System.out.println(i);
        }
        System.out.println("for döngüsü bitti.");

    }
}
