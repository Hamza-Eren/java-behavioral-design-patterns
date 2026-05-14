package tr.com.hamzaeren.designpatterns.behavioral.mediator;

public interface BankMediator {
    void registerCustomer(Customer customer);
    void registerEmployee(Employee employee);
    void assignNextCustomer();
}
