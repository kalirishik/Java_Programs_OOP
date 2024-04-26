import java.util.*;
public class Matrix90Degree{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().replace("],["," ").replace("[","").replace("]","");
        String sp[]=s.split(" ");
        for(int i=0;i<sp.length;i++)
            sp[i]=sp[i].replace(","," ");
        int a[][]=new int[sp.length][sp.length];
        for(int i=0;i<sp.length;i++)
        {
            String sp1[]=sp[i].split(" ");
            for(int j=0;j<sp1.length;j++)
                a[i][j]=Integer.parseInt(sp1[j]);
        }
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int t=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=t;
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length/2;j++){
                int t=a[i][a.length-j-1];
                a[i][a.length-j-1]=a[i][j];
                a[i][j]=t;
            }
        }
        System.out.print("[");
        for(int i=0;i<a.length;i++){
            System.out.print("[");
            for(int j=0;j<a.length;j++){
                if(j!=a.length-1) System.out.print(a[i][j]+",");
                else System.out.print(a[i][j]);
            }
            if(i!=a.length-1) System.out.print("],");
            else  System.out.print("]");
        }
        System.out.print("]");
    }
}