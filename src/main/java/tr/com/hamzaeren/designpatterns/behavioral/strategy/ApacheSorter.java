package tr.com.hamzaeren.designpatterns.behavioral.strategy;

import java.util.logging.Logger;

public class ApacheSorter implements SortingStrategy {
    private static final Logger logger = Logger.getLogger(ApacheSorter.class.getName());

    @Override
    public void sort(int[] numbers) {
        logger.info("Apache Commons Sorter mantığı ile sıralanıyor...");
    }
}
