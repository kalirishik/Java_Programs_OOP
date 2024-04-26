
interface Ai {

    void meth1();

    void meth2();
}

class MyClass implements Ai {
    public void meth1() {
        System.out.println("Implementation of meth1 in MyClass");
    }
    public void meth2() {
        System.out.println("Implementation of meth2 in MyClass");
    }
}

public class Practice16 {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        myObject.meth1();
        myObject.meth2();
    }
}
