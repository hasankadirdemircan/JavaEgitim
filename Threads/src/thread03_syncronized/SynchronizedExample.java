package thread03_syncronized;

public class SynchronizedExample {
    private int count = 0;
    public synchronized void increment() {
        System.out.println(count);
        count++;
    }

    public static void main(String[] args) {
        SynchronizedExample object = new SynchronizedExample();
        Thread thread1 = new Thread(() -> {
            for(int i=0; i<10000; i++){
                object.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int i=0; i<10000; i++){
                object.increment();
            }
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join(); //thread'lerin bitirilip bu satırda kalmasnı bekle
            thread2.join(); //thread'lerin bitirilip bu satırda kalmasnı bekle
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("********************");
        System.out.println("Sonuç : " + object.count);
    }
}
