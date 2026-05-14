package tr.com.hamzaeren.designpatterns.behavioral.strategy;

public class SorterFactory {
    private SorterFactory() {}

    public static SortingStrategy createSorter(SortingType type) {
        return switch (type) {
            case BUBBLE -> new BubbleSorter();
            case JAVA_ARRAY -> new JavaArraySorter();
            case APACHE -> new ApacheSorter();
        };
    }
}
