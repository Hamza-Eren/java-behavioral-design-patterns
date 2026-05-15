package tr.com.hamzaeren.designpatterns.structural.bridge;

public interface DatabaseEngine {
    void insertRecord(String structureName, Object data);
    void selectRecords(String structureName);
}