package constructor_example_last;


public class PaymentService {

    public void odemeAl(Employee employee) {
        System.out.println("paymentservice odemeAl methodu");
        if(employee.salary > 0) {
            System.out.println(employee.name + " 'den ödeme alındı.");
        }
    }
}
