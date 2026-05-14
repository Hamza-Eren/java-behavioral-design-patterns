package tr.com.hamzaeren.designpatterns.behavioral.chainofresponsibility;

public class ImprovementHandler extends SupportHandler {
    @Override
    protected boolean canHandle(SupportRequest request) { return request.getType() == RequestType.IMPROVEMENT; }

    @Override
    protected void process(SupportRequest request) {
        logger.info(String.format("[CORE DEVR] Performans geliştirmesi yapıldı: %s", request.getDescription()));
    }
}
