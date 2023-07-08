package uncaughtexception;

public class UncaughtExceptionExample01 {
    public static void main(String[] args) {
        try {
            concatName("bilgeadam");

        } catch (NullPointerException exception) {
            System.out.println("catch NullPointerException in main method");

        }
        System.out.println("main methodu devam ediyor");


    }

    private static void concatName(String name) {
     /*   try {
            concatHello("hello " + name);
        }catch (NullPointerException exception) {
            System.out.println("catch NullPointerException in concatName method");
        }*/
        concatHello("hello " + name);
        System.out.println("concatName methodu devam ediyor");

    }

    private static void concatHello(String helloName) {
        String welcome = null; //  welcome hello bilgeadam
        String result = null;
        try {
            result = welcome.concat(helloName);
        }catch (NullPointerException exception) {
            System.out.println("catch NullPointerException in concatHello method");

        }
        
        System.out.println("concatHello methodu devam ediyor");
        printConsole(result);
    }

    private static void printConsole(String helloName) {
        System.out.println(helloName);
    }
}
