package tr.com.hamzaeren.designpatterns.structural.bridge;

import java.util.logging.Logger;

public class PostgreSqlEngine implements DatabaseEngine {
    private static final Logger logger = Logger.getLogger(PostgreSqlEngine.class.getName());

    @Override
    public void insertRecord(String structureName, Object data) {
        String message = String.format("[POSTGRESQL] '%s' verisi, [%s] şemasına kaydedildi.", data, structureName);
        logger.info(message);
    }

    @Override
    public void selectRecords(String structureName) {
        String message = String.format("[POSTGRESQL] '%s' şemasından veri taraması yapıldı.", structureName);
        logger.info(message);
    }
}