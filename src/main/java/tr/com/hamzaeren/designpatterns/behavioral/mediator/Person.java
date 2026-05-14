package tr.com.hamzaeren.designpatterns.behavioral.mediator;

public abstract class Person {
    protected final BankMediator mediator;
    protected final String name;

    protected Person(BankMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
