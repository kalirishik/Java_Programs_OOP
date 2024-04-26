import java.util.*;
public class DnaSequence{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        LinkedHashSet<String> hs=new LinkedHashSet<>();
        LinkedHashSet<String> repeat=new LinkedHashSet<>();
        for(int i=0;i<=s.length()-10;i++){
            String v=s.substring(i,i+10);
            if(!hs.add(v))
                repeat.add(v);
        }
        for(String v:repeat) System.out.println(v);
    }
}