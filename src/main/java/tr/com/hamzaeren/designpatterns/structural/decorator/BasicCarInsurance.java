package tr.com.hamzaeren.designpatterns.structural.decorator;

public class BasicCarInsurance implements InsurancePolicy {
    @Override
    public double calculatePremium() {
        return 5000.0; // Baz fiyat
    }

    @Override
    public String getDescription() {
        return "Temel Araç Kasko Poliçesi";
    }
}