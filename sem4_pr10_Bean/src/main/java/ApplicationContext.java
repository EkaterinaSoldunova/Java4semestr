import components.InsertionSort;
import components.MergeSort;
import components.QuickSort;
import config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContext {
    public static void main(String[] args) {
        org.springframework.context.ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        MergeSort mergeSort = (MergeSort) context.getBean("MergeSort");
        InsertionSort insertionSort = (InsertionSort) context.getBean("InsertionSort");
        QuickSort quickSort = (QuickSort) context.getBean("QuickSort");

        mergeSort.doSort();
        insertionSort.doSort();
        quickSort.doSort();
    }
}
