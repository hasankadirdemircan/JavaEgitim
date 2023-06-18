package while_loop;

import java.util.Random;

public class WhileLoopExample03 {
    public static void main(String[] args) {
        Random rastgele = new Random();
        int rastgeleSayi = rastgele.nextInt(6)+1;
        System.out.println(rastgeleSayi);
    }
}
