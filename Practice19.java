
class Point{
    private int x,y;
    public Point(){

    }
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
}
public class Practice19 {
    public static void main(String[] args) {
        Point p=new Point(1,2);
        p.setXY(2,3);
        p.setX(3);
        p.setY(4);
    }
}
