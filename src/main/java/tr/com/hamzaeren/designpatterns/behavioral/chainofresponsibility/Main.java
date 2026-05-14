package tr.com.hamzaeren.designpatterns.behavioral.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        SupportHandler bugHandler = new BugHandler();
        SupportHandler uiHandler = new UIChangeHandler();
        SupportHandler improvementHandler = new ImprovementHandler();
        SupportHandler projectHandler = new ProjectHandler();

        bugHandler.setNextHandler(uiHandler).setNextHandler(improvementHandler).setNextHandler(projectHandler);

        SupportRequest req1 = new SupportRequest(RequestType.BUG, "Giriş ekranında NullPointerException alınıyor.");
        SupportRequest req2 = new SupportRequest(RequestType.UI_CHANGE, "Buton renkleri kurumsal maviye dönüştürülecek.");
        SupportRequest req3 = new SupportRequest(RequestType.PROJECT, "Yeni e-ihracat modülü sıfırdan yazılacak.");

        bugHandler.handleRequest(req1);
        bugHandler.handleRequest(req2);
        bugHandler.handleRequest(req3);
    }
}
