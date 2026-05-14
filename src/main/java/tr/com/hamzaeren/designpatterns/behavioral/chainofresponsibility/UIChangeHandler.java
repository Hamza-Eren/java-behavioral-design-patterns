package tr.com.hamzaeren.designpatterns.behavioral.chainofresponsibility;

public class UIChangeHandler extends SupportHandler {
    @Override
    protected boolean canHandle(SupportRequest request) { return request.getType() == RequestType.UI_CHANGE; }

    @Override
    protected void process(SupportRequest request) {
        logger.info(String.format("[UI DEVR] Arayüz güncellendi: %s", request.getDescription()));
    }
}
