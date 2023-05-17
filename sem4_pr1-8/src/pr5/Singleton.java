package pr5;
//Singleton - паттерн, который позволяет создавать только один объект класса
class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){}
    public static Singleton1 getInstance() {
        if(instance == null) {
            instance = new Singleton1();
            return instance;
        }
        return instance;
    }
}
enum Singleton2 {
    INSTANCE;
    public Singleton2 getInstance() {
        return INSTANCE;
    }
}
class Singleton3 {

    public static final Singleton3 INSTANCE = new Singleton3();

    private Singleton3(){}
    public static Singleton3 getInstance(){
        return INSTANCE;
    }

}

class Test{
    public static void main(String args[]){
        System.out.println("Тестирование первого способа");
        Singleton1 obj1 = Singleton1.getInstance();
        Singleton1 obj2 = Singleton1.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println();

        System.out.println("Тестирование второго способа");
        Singleton2 obj3 = Singleton2.INSTANCE.getInstance();
        Singleton2 obj4 = Singleton2.INSTANCE.getInstance();
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println();

        System.out.println("Тестирование третьего способа");
        Singleton3 obj5 = Singleton3.getInstance();
        Singleton3 obj6 = Singleton3.getInstance();
        System.out.println(obj5);
        System.out.println(obj6);
    }
}