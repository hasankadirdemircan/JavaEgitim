package methods;

import java.util.Scanner;

public class VoidMethodExample01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        sayHello(username);
        System.out.println("-");
        findMyNote(60);
    }

    static void sayHello(String username) {
        System.out.println("hello : " + username);
    }

    static void findMyNote(int note) {
        if(note > 50) {
            System.out.println("notunuz : " + note + " sınavı başarıyla geçtiniz");
        }else {
            System.out.println("notunuz : " + note + " sınavdan kaldınız.");
        }
    }


}
