package tr.com.hamzaeren.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private final String name;
    private double price;
    private final boolean inStock;

    public Product(String name, double price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    public void changePrice(double newPrice) {
        this.price = newPrice;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(name, price, inStock);
        }
    }
}
