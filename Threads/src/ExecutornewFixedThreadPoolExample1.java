import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutornewFixedThreadPoolExample1   {

    public static void main(final String[] arguments) throws InterruptedException {
        ThreadFactory ThreadFactory = Executors.defaultThreadFactory();
        ExecutorService excr = Executors.newFixedThreadPool(5 , ThreadFactory);
        ThreadPoolExecutor mypool = (ThreadPoolExecutor) excr;
        System.out.println("size of mypool: " + mypool.getPoolSize());
        excr.submit(new Threadimpl());
        excr.shutdown();
    }

    static class Threadimpl implements Runnable {
        public void run() {
            try {
                Long num = (long) (Math.random() * 30);
                System.out.println("Thread Name: " +Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(num);
                System.out.println("after sleep Thread Name: " +Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
