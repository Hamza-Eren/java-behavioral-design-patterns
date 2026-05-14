package tr.com.hamzaeren.designpatterns.behavioral.mediator;

import tr.com.hamzaeren.designpatterns.behavioral.observer.CustomerObserver;

import java.util.logging.Logger;

public class Customer extends Person {
    private static final Logger logger = Logger.getLogger(Customer.class.getName());

    public Customer(BankMediator mediator, String name) {
        super(mediator, name);
    }

    public void getService(String employeeName) {
        String message = String.format("[CUSTOMER %s] %s üzerinden hizmet alınıyor ", name, employeeName);
        logger.info(message);
    }
}
