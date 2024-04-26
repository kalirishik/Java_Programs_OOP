import java.util.ArrayList;
import java.util.Scanner;
public class List20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> al1=new ArrayList<>();
        al1.add("volvo");
        al1.add("bmw");
        al1.add("Audi");
        ArrayList<String> al2=new ArrayList<>();
        al2.add("benz");
        al2.add("bmw");
        al2.add("Audi");
        ArrayList<String> al3=new ArrayList<>();
        al3.add("Porche");
        al3.add("bmw");
        al3.add("Audi");
        al1.retainAll(al2);
        al3.retainAll(al1);
        System.out.println(al3);
    }
}
