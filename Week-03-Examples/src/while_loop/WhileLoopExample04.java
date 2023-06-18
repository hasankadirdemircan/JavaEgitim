package while_loop;

import java.util.Random;

public class WhileLoopExample04 {
    public static void main(String[] args) {
        Random random = new Random();
        int dice1, dice2;
        int sayac = 0;
        while (true) {
            dice1 = random.nextInt(6)+1;
            dice2 = random.nextInt(6)+1;
            sayac++;
            System.out.println(sayac + ". deneme -> " + "dice1 : " + dice1 + " dice2 : " + dice2);
            if(dice1 == 6 && dice2 == 6) {
                System.out.println("iki zarda " + sayac + ". denemede 6 geldi ");
                break;
            }
        }
        System.out.println("while döngüsü kırıldı.");
    }
}
