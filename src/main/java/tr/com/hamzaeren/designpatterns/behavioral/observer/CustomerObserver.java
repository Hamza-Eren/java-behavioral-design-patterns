package tr.com.hamzaeren.designpatterns.behavioral.observer;

import java.util.logging.Logger;

public class CustomerObserver implements Observer {
    private static final Logger logger = Logger.getLogger(CustomerObserver.class.getName());
    private final String customerName;

    public CustomerObserver(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void update(String productName, double price, boolean inStock) {
        String message = String.format("[CUSTOMER %s] %s için yeni fiyat alarmı: %.2f TL!", customerName, productName, price);
        logger.info(message);
    }
}
