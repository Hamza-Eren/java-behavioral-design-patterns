package tr.com.hamzaeren.designpatterns.structural.bridge;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        DatabaseEngine sqlServer = new SqlServerEngine();
        DatabaseEngine postgres = new PostgreSqlEngine();

        logger.info("--- Durum 1: SQL Server Arkasında Çalışan Bir Collection ---");
        PersistentStructure myCollection = new PersistentCollection(sqlServer);
        myCollection.add("Hamza");
        myCollection.fetchAll();

        logger.info("\n--- Durum 2: PostgreSQL Arkasında Çalışan Bir Set ---");
        PersistentStructure mySet = new PersistentSet(postgres);
        mySet.add("Eren");
        mySet.fetchAll();
    }
}