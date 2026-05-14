package tr.com.hamzaeren.designpatterns.behavioral.templatemethod;

import java.util.logging.Logger;

public abstract class CallCenterDataTransfer {
    protected static final Logger logger = Logger.getLogger(CallCenterDataTransfer.class.getName());

    public final void transferData() {
        fetchMetadata();
        saveMetadata();
        fetchAudioData();
        verifyAudioWithMetadata();
        saveAudioData();
    }

    protected abstract void fetchMetadata();
    protected abstract void fetchAudioData();

    private void saveMetadata() {
        logger.info("STANDART: Meta veriler saklandı.");
    }

    private void verifyAudioWithMetadata() {
        logger.info("STANDART: Ses verisi doğrulandı.");
    }

    private void saveAudioData() {
        logger.info("STANDART: Ses kaydı saklandı.\n");
    }
}
