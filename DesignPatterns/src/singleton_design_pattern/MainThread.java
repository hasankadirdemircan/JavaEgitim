package singleton_design_pattern;

public class MainThread {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            SingletonDesignPatternThreadSafe singleton = SingletonDesignPatternThreadSafe.getInstance();
            System.out.println("Thread 1 Singleton instance created");
        });

        Thread thread2 = new Thread(() -> {
            SingletonDesignPatternThreadSafe singleton = SingletonDesignPatternThreadSafe.getInstance();
            System.out.println("Thread 2 singleton instance created");
        });

        thread.start();
        thread2.start();
    }
}
