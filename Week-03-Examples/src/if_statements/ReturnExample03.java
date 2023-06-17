package if_statements;

public class ReturnExample03 {
    public static void main(String[] args) {
        System.out.println("işlemden önce.");

        returnExample();

        System.out.println("işlemden sonra");

    }

    public static void returnExample() {
        for (int i=0; i<10; i++) {
            if(i == 5) {
                return;
            }
            System.out.println("işleniyor : " + i);
        }
    }
}
