package tr.com.hamzaeren.designpatterns.structural.decorator;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        InsurancePolicy policy = new BasicCarInsurance();
        policy = new DriverAgeDecorator(policy, 28);
        policy = new AccidentHistoryDecorator(policy, 0);
        policy = new CarEquipmentDecorator(policy, "Değerli Ses Sistemi", 15000.0);

        String message = String.format("Poliçe Primi: %s : %.2f TL", policy.getDescription(), policy.calculatePremium());
        logger.info(message);
    }
}