package tr.com.hamzaeren.designpatterns.behavioral.strategy;

import java.util.logging.Logger;

public class JavaArraySorter implements SortingStrategy {
    private static final Logger logger = Logger.getLogger(JavaArraySorter.class.getName());

    @Override
    public void sort(int[] numbers) {
        logger.info("Java yerleşik Arrays.sort() ile sıralanıyor...");
    }
}
