package tr.com.hamzaeren.designpatterns.structural.proxy;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.logging.Logger;

public class LicenseProxy implements SoftwareService {
    private static final Logger logger = Logger.getLogger(LicenseProxy.class.getName());

    private final RealSoftwareService realService;
    private final int licenseLimit;
    private final Set<String> activeUsers;
    private final Queue<String> waitingQueue;

    public LicenseProxy(int licenseLimit) {
        this.realService = new RealSoftwareService();
        this.licenseLimit = licenseLimit;
        this.activeUsers = new HashSet<>();
        this.waitingQueue = new LinkedList<>();
    }

    @Override
    public void runApplication(String username) {
        if (activeUsers.size() < licenseLimit) {
            activeUsers.add(username);
            String message = String.format("[PROXY] Lisans uygun. %s sisteme alınıyor. (Aktif: %d / %d)", username, activeUsers.size(), licenseLimit);
            logger.info(message);
            realService.runApplication(username);
        } else {
            waitingQueue.add(username);
            String message = String.format("[PROXY] Lisans limiti aşılmak üzere! %s bekleme kuyruğuna alındı. (Kuyruk Sırası: %d)", username, waitingQueue.size());
            logger.info(message);
        }
    }

    public void closeApplication(String username) {
        if (activeUsers.remove(username)) {
            String message = String.format("[PROXY] %s uygulamadan çıkış yaptı. Boş yer açıldı.", username);
            logger.info(message);

            String nextUser = waitingQueue.poll();
            if (nextUser != null) {
                logger.info("[PROXY] Kuyruktaki sıradaki kullanıcı içeri davet ediliyor...");
                runApplication(nextUser);
            }
        }
    }
}