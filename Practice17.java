interface test{
    int square(int n);
}
class ToTestInt implements test{
    public int square(int n){
        return n*n;
    }
}
public class Practice17 {
    public static void main(String[] args) {
        ToTestInt a=new ToTestInt();
        int r=a.square(2);
        System.out.println(r);
    }
}
