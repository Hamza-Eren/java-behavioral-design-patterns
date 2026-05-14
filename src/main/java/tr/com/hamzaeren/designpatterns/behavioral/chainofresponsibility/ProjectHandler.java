package tr.com.hamzaeren.designpatterns.behavioral.chainofresponsibility;

public class ProjectHandler extends SupportHandler {
    @Override
    protected boolean canHandle(SupportRequest request) { return request.getType() == RequestType.PROJECT; }

    @Override
    protected void process(SupportRequest request) {
        logger.info(String.format("[ARCHITECT] Yeni proje mimarisi kuruldu: %s", request.getDescription()));
    }
}
