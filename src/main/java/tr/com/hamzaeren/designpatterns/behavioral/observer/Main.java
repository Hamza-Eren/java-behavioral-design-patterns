package tr.com.hamzaeren.designpatterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Product smartphone = new Product("iPhone 15 Pro", 75000.0, true);

        Observer vendor1 = new VendorObserver("Gonca");
        Observer customer1 = new CustomerObserver("Hamza");
        Observer customer2 = new CustomerObserver("Eren");

        smartphone.registerObserver(vendor1);
        smartphone.registerObserver(customer1);
        smartphone.registerObserver(customer2);

        smartphone.changePrice(69999.90);
    }
}
