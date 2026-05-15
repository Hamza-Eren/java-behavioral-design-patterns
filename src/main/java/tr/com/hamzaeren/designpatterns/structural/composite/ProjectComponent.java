package tr.com.hamzaeren.designpatterns.structural.composite;

public interface ProjectComponent {
    void begin();
    void complete();
    double calculateRisk();
    String getName();
}