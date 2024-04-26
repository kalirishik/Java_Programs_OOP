import java.util.*;
public class GrayCodeSequence{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String sp[]=sc.nextLine().replace("[","").replace("]","").split(",");
        for(int i=0;i<sp.length;i=i+2){
            int n1=Integer.parseInt(sp[i]);
            int n2=Integer.parseInt(sp[i+1]);
            int sum=n1^n2;
            //System.out.println(n1+" - "+n2+" - "+sum+" - "+(sum&(sum-1)));
            if((sum&sum-1)!=0)
            {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}