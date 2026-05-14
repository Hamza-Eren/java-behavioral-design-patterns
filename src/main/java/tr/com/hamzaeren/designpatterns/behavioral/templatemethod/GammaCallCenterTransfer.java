package tr.com.hamzaeren.designpatterns.behavioral.templatemethod;

class GammaCallCenterTransfer extends CallCenterDataTransfer {
    @Override
    protected void fetchMetadata() {
        logger.info("[GAMMA] Meta alınıyor...");
    }

    @Override
    protected void fetchAudioData() {
        logger.info("[GAMMA] Ses indiriliyor...");
    }
}
