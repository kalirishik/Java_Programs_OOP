abstract class Shape2{
    abstract void RectangleArea(double l,double b);
    abstract void SquareArea(double s);
    abstract void CircleArea(double r);
}
class Area2 extends Shape{
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
public class Practice7 {
    public static void main(String[] args) {
        Area2[] a=new Area2[13];
        for(int i=0;i<13;i++){
            a[i]=new Area2();
        }
        for(int i=0;i<4;i++){
            a[i].RectangleArea(3,5);
        }
        for(int i=4;i<8;i++){
            a[i].SquareArea(10);
        }
        for(int i=8;i<13;i++){
            a[i].CircleArea(23);
        }
    }
}
