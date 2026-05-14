package tr.com.hamzaeren.designpatterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        int[] data = {5, 2, 9, 1, 3};

        SortingContext context = new SortingContext();

        SortingStrategy bubble = SorterFactory.createSorter(SortingType.BUBBLE);
        context.setStrategy(bubble);
        context.executeSort(data);

        SortingStrategy javaArray = SorterFactory.createSorter(SortingType.JAVA_ARRAY);
        context.setStrategy(javaArray);
        context.executeSort(data);

        SortingStrategy apacheArray = SorterFactory.createSorter(SortingType.APACHE);
        context.setStrategy(apacheArray);
        context.executeSort(data);
    }
}
