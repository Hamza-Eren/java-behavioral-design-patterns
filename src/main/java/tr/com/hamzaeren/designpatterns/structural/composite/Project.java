package tr.com.hamzaeren.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Project implements ProjectComponent {
    private static final Logger logger = Logger.getLogger(Project.class.getName());
    private final String name;
    private final List<ProjectComponent> components = new ArrayList<>();

    public Project(String name) {
        this.name = name;
    }

    public void addComponent(ProjectComponent component) {
        components.add(component);
    }

    public void removeComponent(ProjectComponent component) {
        components.remove(component);
    }

    @Override
    public void begin() {
        String message = String.format("[PROJE START] '%s' projesi ve alt bileşenleri başlatılıyor...", name);
        logger.info(message);
        for (ProjectComponent component : components) {
            component.begin();
        }
    }

    @Override
    public void complete() {
        String message = String.format("[PROJE END] '%s' projesi tamamlanıyor...", name);
        logger.info(message);
        for (ProjectComponent component : components) {
            component.complete();
        }
    }

    @Override
    public double calculateRisk() {
        double totalRisk = 0;
        for (ProjectComponent component : components) {
            totalRisk += component.calculateRisk();
        }
        return totalRisk;
    }

    @Override
    public String getName() {
        return this.name;
    }
}