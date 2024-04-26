import java.util.Scanner;

public class UTFencoding {
    public static boolean validUtf8(int[] data) {
        int n = 0;
        for (int v : data) {
            if (n > 0) {
                if (v >> 6 != 0b10) {
                    return false;
                }
                --n;
            } else if (v >> 7 == 0) {
                n = 0;
            } else if (v >> 5 == 0b110) {
                n = 1;
            } else if (v >> 4 == 0b1110) {
                n = 2;
            } else if (v >> 3 == 0b11110) {
                n = 3;
            } else {
                return false;
            }
        }
        return n == 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sp[]=sc.nextLine().replace("[","").replace("]","").split(",");
        int a[]=new int[sp.length];
        for(int i=0;i<sp.length;i++)
            a[i]=Integer.parseInt(sp[i]);
        System.out.print(validUtf8(a));
    }
}
