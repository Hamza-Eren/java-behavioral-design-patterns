package tr.com.hamzaeren.designpatterns.structural.composite;

import java.util.logging.Logger;

public class Task implements ProjectComponent {
    private static final Logger logger = Logger.getLogger(Task.class.getName());
    private final String name;
    private final double riskFactor;

    public Task(String name, double riskFactor) {
        this.name = name;
        this.riskFactor = riskFactor;
    }

    @Override
    public void begin() {
        String message = String.format("[TASK] '%s' görevi başlatıldı.", name);
        logger.info(message);
    }

    @Override
    public void complete() {
        String message = String.format("[TASK] '%s' görevi tamamlandı.", name);
        logger.info(message);
    }

    @Override
    public double calculateRisk() {
        return this.riskFactor;
    }

    @Override
    public String getName() {
        return this.name;
    }
}