package tr.com.hamzaeren.designpatterns.behavioral.state;

import java.util.logging.Logger;

public class OffState implements AirConditionState {
    private static final Logger logger = Logger.getLogger(OffState.class.getName());

    @Override
    public void powerButtonSelected(AirConditionContext context) {
        logger.info("[KLİMA] Güç butonuna basıldı. Klima açılıyor... Mod: SOĞUTMA");
        context.setState(new CoolingState());
    }

    @Override
    public void modeButtonSelected(AirConditionContext context) {
        logger.warning("[KLİMA] Klima kapalıyken mod değiştirilemez!");
    }
}
