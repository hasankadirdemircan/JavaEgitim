package aggregation;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("street 1", "city 1");
        AggregationEmployee employee = new AggregationEmployee(1, "Tim", address);
        System.out.println(employee);

        employee = null;
        System.out.println(employee);
        System.out.println(address);
    }
}
