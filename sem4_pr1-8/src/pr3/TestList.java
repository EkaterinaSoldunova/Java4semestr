package pr3;


public class TestList{
    static volatile SemaphoreList list = new SemaphoreList();
    public static void main(String[] args) throws Exception{
        Thread one = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                list.add(i);
            }
        });
        Thread two = new Thread(()->{
            for (int i = 5; i < 10; i++) {
                list.add(i);
            }
        });
        one.start();
        two.start();
        Thread.sleep(1000);
        list.forEach(System.out::println);
    }
}
