package tr.com.hamzaeren.designpatterns.structural.composite;

import java.util.logging.Logger;

public class Issue implements ProjectComponent {
    private static final Logger logger = Logger.getLogger(Issue.class.getName());
    private final String name;
    private final double riskFactor;

    public Issue(String name, double riskFactor) {
        this.name = name;
        this.riskFactor = riskFactor;
    }

    @Override
    public void begin() {
        String message = String.format("[ISSUE] '%s' sorunu üzerinde çalışılmaya başlandı.", name);
        logger.info(message);
    }

    @Override
    public void complete() {
        String message = String.format("[ISSUE] '%s' sorunu çözüldü ve kapatıldı.", name);
        logger.info(message);
    }

    @Override
    public double calculateRisk() {
        return this.riskFactor * 1.5;
    }

    @Override
    public String getName() {
        return this.name;
    }
}