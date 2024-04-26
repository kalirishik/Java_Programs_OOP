abstract class Parent {
    abstract void message();
}
class A extends Parent{
    void message(){
        System.out.println("This is first Sub class");
    }
}
class B extends Parent{
    void message(){
        System.out.println("This is Second Sub class");
    }
}
public class Practice1{
    public static void main(String[] args) {
        A a=new A();
        a.message();
        B b=new B();
        b.message();
    }
}