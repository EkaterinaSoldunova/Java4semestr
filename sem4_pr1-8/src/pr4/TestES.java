package pr4;

import java.util.concurrent.Callable;

public class TestES {
    public static void main(String[] args) throws Exception{
        ExecutorServiceClass executorService = new ExecutorServiceClass(3);

        executorService.submit(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("We run it");
        });
        executorService.submit(() -> System.out.println("Start"));


    }
}
