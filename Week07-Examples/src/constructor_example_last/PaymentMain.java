package constructor_example_last;

public class PaymentMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee(20, 30000, "bilgeadam1");
        Employee employee2 = new Employee(30, -10, "bilgeadam2");
        Employee employee3 = new Employee(40, 35000, "bilgeadam3");
        Employee employeeNull = null;

        PaymentController paymentController = new PaymentController();

        paymentController.odemeAl(employee1);
        paymentController.odemeAl(employee2);

        // NOT: PaymentController'daki odemeAl fonksiyonunu atlayıp direkt
        //olarak PaymentService de bulunan ödemeAl fonksiyonunu çağırırsam işlemler aksayabilir, durabilir.
      /*  PaymentService paymentService = new PaymentService();
        paymentService.odemeAl(employeeNull);*/
        paymentController.odemeAl(employee3);


       /* PaymentMain paymentMain = new PaymentMain();
        paymentMain.odemeAlEkMethod(employee1);
*/
    }

    public void odemeAlEkMethod(Employee employee) {
        System.out.println("odemeAlEkMethod");
        PaymentController paymentController = new PaymentController();
        paymentController.odemeAl(employee);
    }
}

