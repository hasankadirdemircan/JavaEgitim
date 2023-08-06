package enum_example03;


public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.comparison(1);


    }

    public void comparison(int value) {
        for (Employee emp : Employee.values()) {
            if (value == emp.getKey()) {
                System.out.println("Gelen degeri : " + value + " olan kisi : " + emp.name());
            }
        }
    }
}
