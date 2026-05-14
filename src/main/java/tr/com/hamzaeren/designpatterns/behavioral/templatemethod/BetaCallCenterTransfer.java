package tr.com.hamzaeren.designpatterns.behavioral.templatemethod;

class BetaCallCenterTransfer extends CallCenterDataTransfer {
    @Override
    protected void fetchMetadata() {
        logger.info("[BETA] Meta alınıyor...");
    }

    @Override
    protected void fetchAudioData() {
        logger.info("[BETA] Ses indiriliyor...");
    }
}
