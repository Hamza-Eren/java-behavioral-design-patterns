package tr.com.hamzaeren.designpatterns.behavioral.strategy;

public class SortingContext {
    private SortingStrategy strategy;

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeSort(int[] numbers) {
        if (strategy == null) {
            throw new IllegalStateException("Lütfen önce bir sıralama stratejisi belirleyin!");
        }
        strategy.sort(numbers);
    }
}
