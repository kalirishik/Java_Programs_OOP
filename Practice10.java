import java.util.Scanner;
class Swap{
    int d;
    public Swap(int d){
        this.d=d;
    }
}
public class Practice10 {
    public static void callByValue(int a,int b){
        int t=a;
        a=b;
        b=t;
        System.out.println("After swapping a = "+a+" b = "+b);
    }
    public static void callByReference(Swap s1,Swap s2){
        int t=s1.d;
        s1.d=s2.d;
        s2.d=t;
        System.out.println("After swapping s1 = "+s1.d+" s2 = "+s2.d);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=30;
        int b=40;
        System.out.println("-----  Call By Value  ----------");
        System.out.println("Before swapping a = "+a+" b = "+b);
        callByValue(a,b);
        System.out.println("-----  Call By Reference  ----------");
        System.out.println("Before swapping s1 = 30  s2 = 40");
        Swap s1=new Swap(30);
        Swap s2=new Swap(40);
        callByReference(s1,s2);

    }
}
