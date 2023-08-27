package thread01;

public class Main {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("Thread name : " + mainThread.getName());
        System.out.println("Thread state : " + mainThread.getState());
      /*  mainThread.setName("new thread name");
        System.out.println(mainThread);*/
        MyThread thread = new MyThread();
        thread.run();

        System.out.println("Thread name : " + thread.getName());
        System.out.println("Thread state : " + thread.getState());
    }
}