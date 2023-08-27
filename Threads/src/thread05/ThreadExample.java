package thread05;

public class ThreadExample {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            for(int i=1; i<=5; i++) {
                System.out.println("Thread 1 - count : " + i);
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable task2 = () -> {
            for(int i=1; i<=5; i++) {
                System.out.println("Thread 2 - " + i);
                try {
                    Thread.sleep(700); //0.7 saniye
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start(); // Thread 1'i başlat
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread sonlandı");
    }
}
