import java.util.ArrayList;
import java.util.Scanner;
public class List17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(10);
        al.add(11);
        al.add(12);
        al.add(13);
        al.add(14);
        al.add(15);
        System.out.println(al.get(9));
        al.set(4,35);
        int r=al.get(5)+al.get(12);
        al.set(8,r);
        for(int s:al)
            System.out.println(s);
    }
}
