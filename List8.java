import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class List8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> al=new ArrayList<>();
        al.add("volvo");
        al.add("bmw");
        al.add("Audi");
        System.out.println(al);
        List<String> al2= al.subList(0,1);
        System.out.println(al2);
    }
}
