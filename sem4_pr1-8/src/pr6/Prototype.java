package pr6;

//Паттерн «Прототип» – позволяет копировать объекты без обращения к приватному состоянию извне

interface Prototype {
    Prototype clone();
}
class ConcretePrototype implements Prototype {

    public ConcretePrototype clone() {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        return concretePrototype;
    }

}

class PrototypeTest {//тест
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype();
        ConcretePrototype clone = prototype.clone();
    }
}
