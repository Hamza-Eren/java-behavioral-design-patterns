package tr.com.hamzaeren.designpatterns.behavioral.mediator;

import java.util.logging.Logger;

public class Employee extends Person {
    private static final Logger logger = Logger.getLogger(Employee.class.getName());

    private boolean isAvailable = true;

    public Employee(BankMediator mediator, String name) {
        super(mediator, name);
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public void serve(Customer customer) {
        this.isAvailable = false;
        String message = String.format("[Employee %s] Müşteri %s için işlem başlattı ", name, customer.getName());
        logger.info(message);
        customer.getService(this.name);
        this.isAvailable = true;
    }
}
