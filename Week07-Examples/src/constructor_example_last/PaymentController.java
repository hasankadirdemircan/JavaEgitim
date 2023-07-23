package constructor_example_last;

public class PaymentController {
    PaymentService paymentService = null;
    PaymentController() {
        System.out.println("payment controller constructor");
        paymentService = new PaymentService();
    }

    public void odemeAl(Employee employee) {
        System.out.println(paymentService.toString());
        if(employee != null){
            paymentService.odemeAl(employee);
        }else {
            System.out.println("yanlış employee tanımı");
        }

    }
}
