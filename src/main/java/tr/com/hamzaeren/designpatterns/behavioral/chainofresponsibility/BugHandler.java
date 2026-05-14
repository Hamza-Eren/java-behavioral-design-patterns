package tr.com.hamzaeren.designpatterns.behavioral.chainofresponsibility;

public class BugHandler extends SupportHandler {
    @Override
    protected boolean canHandle(SupportRequest request) { return request.getType() == RequestType.BUG; }

    @Override
    protected void process(SupportRequest request) {
        logger.info(String.format("[BUG DEVR] Hata çözüldü: %s", request.getDescription()));
    }
}
