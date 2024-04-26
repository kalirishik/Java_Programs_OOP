import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class List13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> al=new ArrayList<>();
        al.add("volvo");
        al.add("bmw");
        al.add("Audi");
        al.add("Porche");
        Object obj[]=al.toArray();
        for(Object ob:obj)
        System.out.println(ob);
    }
}
