package tr.com.hamzaeren.designpatterns.structural.bridge;

import java.util.logging.Logger;

public class SqlServerEngine implements DatabaseEngine {
    private static final Logger logger = Logger.getLogger(SqlServerEngine.class.getName());

    @Override
    public void insertRecord(String structureName, Object data) {
        String message = String.format("[SQL SERVER] '%s' verisi, [%s] tablosuna INSERT edildi.", data, structureName);
        logger.info(message);
    }

    @Override
    public void selectRecords(String structureName) {
        String message = String.format("[SQL SERVER] SELECT * FROM %s komutu çalıştırıldı.", structureName);
        logger.info(message);
    }
}