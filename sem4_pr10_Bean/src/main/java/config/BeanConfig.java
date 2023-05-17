package config;

import components.MergeSort;
import components.InsertionSort;
import components.QuickSort;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BeanConfig {

    @Bean("MergeSort")
    public MergeSort mergeSort() {
        return new MergeSort();
    }

    @Bean("InsertionSort")
    public InsertionSort insertionSort() {
        return new InsertionSort();
    }

    @Bean("QuickSort")
    public QuickSort quickSort() {
        return new QuickSort();
    }
}
