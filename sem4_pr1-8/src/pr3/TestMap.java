package pr3;

public class TestMap {
    static volatile SynchronizedMap map = new SynchronizedMap();
    public static void main(String[] args) throws Exception{
        Thread one = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                map.put(i,i*2);
            }
        });
        Thread two = new Thread(()->{
            for (int i = 5; i < 10; i++) {
                map.put(i,i*2);
            }
        });
        one.start();
        two.start();
        Thread.sleep(1000);
        map.print();
    }
}
