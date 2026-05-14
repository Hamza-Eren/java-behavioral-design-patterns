package tr.com.hamzaeren.designpatterns.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        BankMediator xBank = new BranchMediator();

        Employee emp1 = new Employee(xBank, "Ahmet");
        Employee emp2 = new Employee(xBank, "Zeynep");
        xBank.registerEmployee(emp1);
        xBank.registerEmployee(emp2);

        Customer cust1 = new Customer(xBank, "Hamza");
        Customer cust2 = new Customer(xBank, "Eren");
        Customer cust3 = new Customer(xBank, "Gonca");

        xBank.registerCustomer(cust1);
        xBank.registerCustomer(cust2);
        xBank.registerCustomer(cust3);
    }
}
