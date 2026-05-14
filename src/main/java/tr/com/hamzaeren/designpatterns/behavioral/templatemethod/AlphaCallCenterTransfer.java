package tr.com.hamzaeren.designpatterns.behavioral.templatemethod;

class AlphaCallCenterTransfer extends CallCenterDataTransfer {
    @Override
    protected void fetchMetadata() {
        logger.info("[ALPHA] Meta alınıyor...");
    }

    @Override
    protected void fetchAudioData() {
        logger.info("[ALPHA] Ses indiriliyor...");
    }
}
