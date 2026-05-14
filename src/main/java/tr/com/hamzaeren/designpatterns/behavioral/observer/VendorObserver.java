package tr.com.hamzaeren.designpatterns.behavioral.observer;

import java.util.logging.Logger;

public class VendorObserver implements Observer {
    private static final Logger logger = Logger.getLogger(VendorObserver.class.getName());
    private final String companyName;

    public VendorObserver(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void update(String productName, double price, boolean inStock) {
        if (!inStock) {
            String message = String.format("[VENDOR %s] Dikkat: %s stoğu tükendi! Yeni sipariş geçilmeli.", companyName, productName);
            logger.warning(message);
        } else {
            String message = String.format("[VENDOR %s] %s stoğu güvenli seviyede.", companyName, productName);
            logger.info(message);
        }
    }
}
