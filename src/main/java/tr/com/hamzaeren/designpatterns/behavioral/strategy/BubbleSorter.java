package tr.com.hamzaeren.designpatterns.behavioral.strategy;

import java.util.logging.Logger;

public class BubbleSorter implements SortingStrategy {
    private static final Logger logger = Logger.getLogger(BubbleSorter.class.getName());

    @Override
    public void sort(int[] numbers) {
        logger.info("Bubble Sort algoritması ile sıralanıyor...");
    }
}
