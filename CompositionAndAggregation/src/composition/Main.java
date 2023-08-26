package composition;

public class Main {
    public static void main(String[] args) {
        CompositeEmployee compositeEmployee = new CompositeEmployee(1, "John", "street1", "city1");
        System.out.println(compositeEmployee);

        compositeEmployee = null;
        System.out.println(compositeEmployee);
    }
}
