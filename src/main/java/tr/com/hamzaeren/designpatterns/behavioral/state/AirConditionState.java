package tr.com.hamzaeren.designpatterns.behavioral.state;

public interface AirConditionState {
    void powerButtonSelected(AirConditionContext context);
    void modeButtonSelected(AirConditionContext context);
}
