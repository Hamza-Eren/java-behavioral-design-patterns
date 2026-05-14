package tr.com.hamzaeren.designpatterns.behavioral.mediator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class BranchMediator implements BankMediator {
    private static final Logger logger = Logger.getLogger(BranchMediator.class.getName());

    private final Queue<Customer> customerQueue = new LinkedList<>();
    private final List<Employee> employees = new ArrayList<>();

    @Override
    public void registerCustomer(Customer customer) {
        String message = String.format("[SIRA] Müşteri %s bankaya giriş yaptı ve sıra numarası aldı.", customer.getName());
        logger.info(message);
        customerQueue.add(customer);
        assignNextCustomer();
    }

    @Override
    public void registerEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void assignNextCustomer() {
        if (customerQueue.isEmpty()) return;

        for (Employee employee : employees) {
            if (employee.isAvailable()) {
                Customer nextCustomer = customerQueue.poll();
                if (nextCustomer != null) {
                    employee.serve(nextCustomer);
                    break;
                }
            }
        }
    }
}
