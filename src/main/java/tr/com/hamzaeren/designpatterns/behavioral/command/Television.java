package tr.com.hamzaeren.designpatterns.behavioral.command;

import java.util.logging.Logger;

public class Television {
    private static final Logger logger = Logger.getLogger(Television.class.getName());

    private int volume = 10;
    private int channel = 1;

    public void turnOn() {
        logger.info("Televizyon açıldı.");
    }

    public void turnOff() {
        logger.info("Televizyon kapatıldı.");
    }

    public void setChannel(int newChannel) {
        this.channel = newChannel;
        String message = String.format("Kanal değiştirildi. Mevcut Kanal: %d", channel);
        logger.info(message);
    }

    public void volumeUp() {
        volume++;
        String message = String.format("Ses arttırıldı. Mevcut Ses: %d", volume);
        logger.info(message);
    }

    public void volumeDown() {
        volume--;
        String message = String.format("Ses azaltıldı. Mevcut Ses: %d", volume);
        logger.info(message);
    }
}
