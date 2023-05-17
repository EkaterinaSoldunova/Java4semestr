package pr8;

//Паттерн «Стратегия» позволяет определить семейство различных алгоритмов, которые можно заменять

interface Strategy {
    void execute();
}
class ConcreteStrategyA implements Strategy {
    public void execute() {
        System.out.println("A");
    }
}
class ConcreteStrategyB implements Strategy {
    public void execute() {
        System.out.println("B");
    }
}
class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public void execute(){
        strategy.execute();
    }
}

class StrategyTest {//тест
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.execute();
        context = new Context(new ConcreteStrategyB());
        context.execute();
    }
}
