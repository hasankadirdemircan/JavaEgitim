package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class ConsumerExample04 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500.0));
        products.add(new Product("Phone", 800.0));
        products.add(new Product("Tablet", 400.0));

        // Consumer kullanarak her bir ürünün adını ve fiyatını yazdır
        Consumer<Product> printProductInfo = product -> {
            System.out.println("print");
            System.out.println("Product: " + product.getName() + ", Price: $" + product.getPrice());
        };

        // Her bir ürünü işle
        products.forEach(printProductInfo);
    }
}