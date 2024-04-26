class Shapes{
    public void draw(){
        System.out.println("Draw - Shape");
    }
    public void erase(){
        System.out.println("Erase - Shape");
    }
}
class Circle extends Shapes{
   public void draw(){
        System.out.println("Draw - Circle");
    }
    public void erase(){
        System.out.println("Erase - circle");
    }
}
class Rectangle extends Shapes{
    public void draw(){
        System.out.println("Draw - Rectangle");
    }
    public void erase(){
        System.out.println("Erase - Rectangle");
    }
}
class Triangle extends Shapes{
    public void draw(){
        System.out.println("Draw - Triangle");
    }
    public void erase(){
        System.out.println("Erase - Triangle");
    }
}
public class Practice13 {
    public static void main(String[] args) {
        Shapes circle=new Circle();
        Shapes Rectangle=new Rectangle();
        Shapes triangle=new Triangle();
        circle.draw();
        circle.erase();
        Rectangle.draw();
        Rectangle.erase();
        triangle.draw();
        triangle.erase();
    }
}
