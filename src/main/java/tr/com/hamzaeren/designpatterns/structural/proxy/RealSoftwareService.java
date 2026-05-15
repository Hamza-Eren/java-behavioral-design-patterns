package tr.com.hamzaeren.designpatterns.structural.proxy;

import java.util.logging.Logger;

public class RealSoftwareService implements SoftwareService {
    private static final Logger logger = Logger.getLogger(RealSoftwareService.class.getName());

    @Override
    public void runApplication(String username) {
        String message = String.format("[YAZILIM] %s için ana uygulama başarıyla başlatıldı ve çalışıyor.", username);
        logger.info(message);
    }
}