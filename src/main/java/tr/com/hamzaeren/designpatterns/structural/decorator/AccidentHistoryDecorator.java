package tr.com.hamzaeren.designpatterns.structural.decorator;

public class AccidentHistoryDecorator extends PolicyDecorator {
    private final int accidentCount;

    public AccidentHistoryDecorator(InsurancePolicy policy, int accidentCount) {
        super(policy);
        this.accidentCount = accidentCount;
    }

    @Override
    public double calculatePremium() {
        return super.calculatePremium() + (accidentCount * 2000.0); // Kaza başına 2000
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " [+ " + accidentCount + " Adet Kaza Geçmişi]";
    }
}