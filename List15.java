import java.util.ArrayList;
import java.util.Scanner;
public class List15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al2.add(1);
        al2.add(2);
        al2.add(3);
        al2.add(4);
        al2.add(5);
        al.addAll(al2);
        System.out.println(al);
    }
}
