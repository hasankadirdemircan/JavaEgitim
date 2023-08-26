package observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    private String productName;
    private boolean available;
    private List<Observer> observerList = new ArrayList<>();

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
        if(available) {
            notifyObservers();
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    // üründen haber almak isteyen müşterileri döner.
    public List<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Haber almak isteyen müşterilere ürün geldiğinde haber veriliyor..");
        for(Observer observer : observerList) {
            observer.update(productName);
        }
    }
}
