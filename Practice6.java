abstract class Shape{
    abstract void RectangleArea(double l,double b);
    abstract void SquareArea(double s);
    abstract void CircleArea(double r);
}
class Area extends Shape{
    void RectangleArea(double l,double b){
        System.out.println("Area of Reactangle : "+(l*b));
    }
    void SquareArea(double s){
        System.out.println("Area of square : "+(s*s));
    }
    void CircleArea(double r){
        System.out.println("Area of Circle : "+(Math.PI*(r*r)));
    }
}
public class Practice6 {
    public static void main(String[] args) {
        Area a=new Area();
        a.RectangleArea(3,5);
        a.SquareArea(10);
        a.CircleArea(23);
    }
}
