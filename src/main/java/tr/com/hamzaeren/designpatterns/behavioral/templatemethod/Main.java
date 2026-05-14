package tr.com.hamzaeren.designpatterns.behavioral.templatemethod;

public class Main {
    public static void main(String[] args) {
        new AlphaCallCenterTransfer().transferData();
        new BetaCallCenterTransfer().transferData();
        new GammaCallCenterTransfer().transferData();
    }
}
