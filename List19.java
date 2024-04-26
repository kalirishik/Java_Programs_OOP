import java.util.ArrayList;
import java.util.Scanner;
public class List19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<10;i++)
            al.add(sc.nextInt());
        int sum=0;
        for(int s:al)
            sum+=s;
            System.out.println(sum);
    }
}
