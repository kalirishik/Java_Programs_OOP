import java.util.ArrayList;
import java.util.Scanner;
public class List10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> al=new ArrayList<>();
        al.add("volvo");
        al.add("bmw");
        al.add("Audi");
        int i=sc.nextInt();
        System.out.println(al.contains(al.get(i)));
    }
}
