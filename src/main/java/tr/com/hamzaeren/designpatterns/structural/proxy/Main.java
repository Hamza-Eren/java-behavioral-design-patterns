package tr.com.hamzaeren.designpatterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        LicenseProxy softwareProxy = new LicenseProxy(2);
        softwareProxy.runApplication("Hamza");
        softwareProxy.runApplication("Eren");
        softwareProxy.runApplication("Gonca");
        softwareProxy.closeApplication("Hamza");
    }
}