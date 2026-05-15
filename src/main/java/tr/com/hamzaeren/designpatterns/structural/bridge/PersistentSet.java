package tr.com.hamzaeren.designpatterns.structural.bridge;

public class PersistentSet extends PersistentStructure {

    public PersistentSet(DatabaseEngine dbEngine) {
        super(dbEngine);
    }

    @Override
    public void add(Object element) {
        dbEngine.insertRecord("TB_SET_UNIQUE", element);
    }

    @Override
    public void fetchAll() {
        dbEngine.selectRecords("TB_SET_UNIQUE");
    }
}