package tr.com.hamzaeren.designpatterns.behavioral.state;

import java.util.logging.Logger;

public class HeatingState implements AirConditionState {
    private static final Logger logger = Logger.getLogger(HeatingState.class.getName());

    @Override
    public void powerButtonSelected(AirConditionContext context) {
        logger.info("[KLİMA] Güç butonuna basıldı. Klima kapatılıyor.");
        context.setState(new OffState());
    }

    @Override
    public void modeButtonSelected(AirConditionContext context) {
        logger.info("[KLİMA] Mod butonuna basıldı. Soğutma moduna geri dönülüyor.");
        context.setState(new CoolingState());
    }
}