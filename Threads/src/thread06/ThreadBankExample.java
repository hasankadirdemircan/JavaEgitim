package thread06;

public class ThreadBankExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.deposit(200); // burda account.withdraw deseydik,
                //withdraw methodunu syncronized yapmalıydı.
               try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                account.withdraw(300);
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}