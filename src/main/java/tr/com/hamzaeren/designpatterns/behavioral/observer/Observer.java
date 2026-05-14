package tr.com.hamzaeren.designpatterns.behavioral.observer;

public interface Observer {
    void update(String productName, double price, boolean inStock);
}
