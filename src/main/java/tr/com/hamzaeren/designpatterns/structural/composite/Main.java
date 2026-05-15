package tr.com.hamzaeren.designpatterns.structural.composite;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        ProjectComponent task1 = new Task("Veritabanı Şeması Tasarımı", 10.5);
        ProjectComponent task2 = new Task("API Uç Noktalarının Yazılması", 15.0);
        ProjectComponent issue1 = new Issue("Giriş Ekranı Bug Fix", 5.0);

        Project mainProject = new Project("E-Ticaret Dönüşüm Projesi");
        mainProject.addComponent(task1);
        mainProject.addComponent(task2);
        mainProject.addComponent(issue1);

        Project infrastructureSubProject = new Project("Altyapı Güvenlik Alt Projesi");
        ProjectComponent securityTask = new Task("SSL Sertifikalarının Yenilenmesi", 20.0);
        infrastructureSubProject.addComponent(securityTask);

        mainProject.addComponent(infrastructureSubProject);

        mainProject.begin();

        logger.info("========================================");
        logger.info("Toplam Proje Risk Skoru: " + mainProject.calculateRisk());
        logger.info("========================================");

        mainProject.complete();
    }
}