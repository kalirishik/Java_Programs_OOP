import java.util.ArrayList;
import java.util.Scanner;
public class List18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> al=new ArrayList<>();
        al.add("Sunday");
        al.add("monday");
        al.add("tuesday");
        al.add("wednesday");
        al.add("thursday");
        al.add("friday");
        al.add("saturday");
        for(String s:al)
            System.out.println(s);
    }
}
