package tr.com.hamzaeren.designpatterns.behavioral.chainofresponsibility;

import java.util.logging.Logger;

public abstract class SupportHandler {
    static final Logger logger = Logger.getLogger(SupportHandler.class.getName());

    protected SupportHandler nextHandler;

    public SupportHandler setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public void handleRequest(SupportRequest request) {
        if (canHandle(request)) {
            process(request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            logger.info(String.format("[UYARI] İstek zincirde işlenemedi: %s", request.getDescription()));
        }
    }

    protected abstract boolean canHandle(SupportRequest request);
    protected abstract void process(SupportRequest request);
}
