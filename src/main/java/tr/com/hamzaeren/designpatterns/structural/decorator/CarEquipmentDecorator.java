package tr.com.hamzaeren.designpatterns.structural.decorator;

public class CarEquipmentDecorator extends PolicyDecorator {
    private final String equipmentName;
    private final double equipmentValue;

    public CarEquipmentDecorator(InsurancePolicy policy, String equipmentName, double equipmentValue) {
        super(policy);
        this.equipmentName = equipmentName;
        this.equipmentValue = equipmentValue;
    }

    @Override
    public double calculatePremium() {
        return super.calculatePremium() + (equipmentValue * 0.10); // Donanım değerinin %10'u
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " [+ Ekstra Donanım: " + equipmentName + "]";
    }
}