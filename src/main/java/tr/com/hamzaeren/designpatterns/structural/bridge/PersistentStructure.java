package tr.com.hamzaeren.designpatterns.structural.bridge;

public abstract class PersistentStructure {
    protected final DatabaseEngine dbEngine;

    protected PersistentStructure(DatabaseEngine dbEngine) {
        this.dbEngine = dbEngine;
    }

    public abstract void add(Object element);
    public abstract void fetchAll();
}