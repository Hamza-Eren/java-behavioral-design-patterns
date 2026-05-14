package tr.com.hamzaeren.designpatterns.behavioral.state;

import java.util.logging.Logger;

public class CoolingState implements AirConditionState {
    private static final Logger logger = Logger.getLogger(CoolingState.class.getName());

    @Override
    public void powerButtonSelected(AirConditionContext context) {
        logger.info("[KLİMA] Güç butonuna basıldı. Klima kapatılıyor.");
        context.setState(new OffState());
    }

    @Override
    public void modeButtonSelected(AirConditionContext context) {
        logger.info("[KLİMA] Mod butonuna basıldı. Isıtma moduna geçiliyor.");
        context.setState(new HeatingState());
    }
}
