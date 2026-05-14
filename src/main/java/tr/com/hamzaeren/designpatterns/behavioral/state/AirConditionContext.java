package tr.com.hamzaeren.designpatterns.behavioral.state;

public class AirConditionContext {
    private AirConditionState currentState;

    public AirConditionContext() {
        this.currentState = new OffState();
    }

    public void setState(AirConditionState state) {
        this.currentState = state;
    }

    public void pressPowerButton() {
        currentState.powerButtonSelected(this);
    }

    public void pressModeButton() {
        currentState.modeButtonSelected(this);
    }
}
