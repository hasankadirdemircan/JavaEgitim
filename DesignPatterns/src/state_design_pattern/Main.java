package state_design_pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LampContext context = new LampContext();
        System.out.println("Lambanın başlangıç durumu : "
                + context.getLampState().getClass().getName());

        System.out.println();
        context.onClose();
        context.onOpen();

        System.out.println("***************************");

        System.out.println("Lambanın şuan durumu : " + context.getLampState().getClass().getName());
        context.onOpen();
        context.onClose();
        System.out.println();
        System.out.println("Lambanın son durumu : " + context.getLampState().getClass().getName());
    }
}