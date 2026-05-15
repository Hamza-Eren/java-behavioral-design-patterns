package tr.com.hamzaeren.designpatterns.structural.decorator;

public abstract class PolicyDecorator implements InsurancePolicy {
    protected final InsurancePolicy decoratedPolicy;

    protected PolicyDecorator(InsurancePolicy policy) {
        this.decoratedPolicy = policy;
    }

    @Override
    public double calculatePremium() {
        return decoratedPolicy.calculatePremium();
    }

    @Override
    public String getDescription() {
        return decoratedPolicy.getDescription();
    }
}