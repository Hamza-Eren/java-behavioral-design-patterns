package tr.com.hamzaeren.designpatterns.structural.bridge;

public class PersistentCollection extends PersistentStructure {

    public PersistentCollection(DatabaseEngine dbEngine) {
        super(dbEngine);
    }

    @Override
    public void add(Object element) {
        dbEngine.insertRecord("TB_COLLECTION", element);
    }

    @Override
    public void fetchAll() {
        dbEngine.selectRecords("TB_COLLECTION");
    }
}