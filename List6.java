import java.util.ArrayList;
import java.util.Scanner;
public class List6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> al=new ArrayList<>();
        al.add("volvo");
        al.add("bmw");
        al.add("Audi");
        System.out.println(al);
        al.remove(0);
        System.out.println(al);
    }
}
