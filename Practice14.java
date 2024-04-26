abstract class Ac{
    abstract void display();
}
class Bc extends Ac{
    void display(){
        System.out.println("It is abstract method");
    }
}
public class Practice14 {
    public static void main(String[] args) {
        Bc b=new Bc();
        b.display();
    }
}
