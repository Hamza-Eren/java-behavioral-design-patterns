package tr.com.hamzaeren.designpatterns.structural.decorator;

public class DriverAgeDecorator extends PolicyDecorator {
    private final int driverAge;

    public DriverAgeDecorator(InsurancePolicy policy, int driverAge) {
        super(policy);
        this.driverAge = driverAge;
    }

    @Override
    public double calculatePremium() {
        double extraPremium = (driverAge < 25 || driverAge > 50) ? 1500.0 : 0.0;
        return super.calculatePremium() + extraPremium;
    }

    @Override
    public String getDescription() {
        String ageNote = (driverAge < 25 || driverAge > 50) ? " [+ Sürücü Yaş Riski]" : "";
        return super.getDescription() + ageNote;
    }
}