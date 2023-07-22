package class_examples;

/*
Customer adında bir Class'ım olsun.
Bu class'ımın attibute'leri bakiye, isPremium,
fonksiyon harca(),

siz Customer' classsından bir obje üretin bu objeye bir bakiye set edinn,
daha sonra kullanıcıdan kaç tl harcadığına bakın, eğer harrcamak istediği ücret bakiyeden yüksekse,
harcatmayın.

eğer bakiye yeterli ise; harcama yapabilsin.

isPremium ise, harcadığının %10'unu bakiyesine tekrar ekle.

isPremium değilse, harcasın ve bakiyesine ekleme yapma.
 */
public class SpendMoney {

    public static void main(String[] args) {
        SpendMoney spendMoney = new SpendMoney();
        double price = 10;
        Customer customer1 = new Customer();
        customer1.balance = 100;
        customer1.isPremium = true;

        spendMoney.buyMachine(customer1, price);

        Customer customer2 = new Customer();

        customer2.balance = 20;
        customer2.isPremium = true;
        spendMoney.buyMachine(customer2, price);

    }

    public void buyMachine(Customer customer, double price) {
        SpendMoney spendMoney = new SpendMoney();

        boolean isSpent = spendMoney.isSpent(customer.balance, price);

        if (isSpent) {
            double remainBalance = customer.spendMoney(price);
            if (customer.isPremium) {

                customer.balance = remainBalance + spendMoney.calculatePercent(price);
                System.out.println(customer.balance);
            } else {
                customer.balance = remainBalance;
                System.out.println(customer.balance);
            }
        } else {
            System.out.println("bakiye yetersiz");
        }
    }

    private boolean isSpent(double balance, double price) {
        return balance - price >= 0;
    }

    private double calculatePercent(double price) {
        return price * Customer.PERCENT_VALUE;
    }

}
