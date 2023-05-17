package pr7;
//Паттерн «Декоратор» позволяет добавлять новую функциональность объекту, является некоторой оберткой над классом. Не управляет жизненным циклом объекта.
interface Cake {
    void info();
}
class FirstCake implements Cake {
    public void info() {
        System.out.println("FirstCake");
    }
}
class SecondCake implements Cake {
    public void info() {
        System.out.println("SecondCake");
    }
}
abstract class CakeDecorator implements Cake {
    protected Cake decorated;
    public CakeDecorator(Cake decorated){
        this.decorated = decorated;
    }
    public void info(){
        decorated.info();
    }
}
class PinkCakeDecorator extends CakeDecorator {
    public PinkCakeDecorator(Cake decorated) {
        super(decorated);
    }
    public void info() {
        decorated.info();
        setColor();
    }
    private void setColor(){
        System.out.println("Color: pink");
    }
}

class DecoratorTest {//тест
    public static void main(String[] args) {
        Cake firstCake = new FirstCake();
        Cake pinkSecondCake = new PinkCakeDecorator(new SecondCake());
        firstCake.info();
        pinkSecondCake.info();
    }
}