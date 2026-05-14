package tr.com.hamzaeren.designpatterns.behavioral.state;

public class Main {
    public static void main(String[] args) {
        AirConditionContext ac = new AirConditionContext();
        ac.pressModeButton(); // kapalı iken uyarı vermeli
        ac.pressPowerButton(); // açık durumuna geçmeli
        ac.pressModeButton(); // ısıtma moduna geçmeli
        ac.pressModeButton(); // tekrar soğutma moduna dönmeli
        ac.pressPowerButton(); // kapalı durumuna geçmeli
    }
}
