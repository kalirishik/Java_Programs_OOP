import java.util.Scanner;

public class Main1 {
    public static int switc(int c) {
        switch (c) {
            case 0:
                return 4;
            case 1:
                return 3;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 4;
            case 5:
                return 4;
            case 6:
                return 3;
            case 7:
                return 3;
            case 8:
                return 5;
            case 9:
                return 4;
        }
        return 0;
    }
    public static void count(int a){
        while(a>0) {
            int rem = a % 10;
           int sum= switc(rem);
            a = a / 10;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=14;i<=87;i++){
                count(i);
                break;
        }
        System.out.println();
    }
}
