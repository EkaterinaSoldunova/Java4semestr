package pr7;

//Паттерн «Адаптер» позволяет какой-то объект с одним интерфейсом подстроить под другой интерфейс

class ClassA {
    private int x;
    public ClassA() { x = 1; }
    public void getx() {
        System.out.println("ClassA x = " + x);
    }
}
class ClassB {
    private int x;
    public ClassB() { x = 2; }
    public void getx() {
        System.out.println("ClassB x = " + x);
    }
}
class ClassAAdapter extends ClassA {
    private ClassB classb;
    public ClassAAdapter(ClassB classb) {
        this.classb = classb;
    }
    public void getx() {
        classb.getx();
    }
}

class AdapterTest {//тест
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.getx();
        ClassAAdapter b = new ClassAAdapter(new ClassB());
        b.getx();
    }
}
