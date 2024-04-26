abstract class Animal{
    abstract void cats();
    abstract void dogs();
}
class Cats extends Animal{
    void cats(){
        System.out.println("cats meow");
    }
    void dogs(){}
}
class Dogs extends Animal{
    void dogs(){
        System.out.println("Dags bark");
    }
    void cats(){}
}
public class Practice5 {
    public static void main(String[] args) {
        Cats c=new Cats();
        c.cats();
        Dogs d=new Dogs();
        d.dogs();
    }
}
