abstract class Ab {
    Ab(){
        System.out.println("This is Constructor of abstract class");
    }
    abstract void a_method();
    void normalMethod(){
        System.out.println("It is normal method od abstract class");
    }
}
class Subclass extends Ab{
    void a_method(){
        System.out.println("This is abstract method");
    }
}
public class Practice4 {
    public static void main(String[] args) {
        Subclass sb=new Subclass();
        sb.a_method();
        sb.normalMethod();

    }
}
