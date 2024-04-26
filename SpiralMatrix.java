import java.util.Scanner;
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int rs = 0, re = r - 1, cs = 0, ce = c - 1;
        int a[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        while (rs <= re && cs <= ce) {
            for (int i = cs; i <= ce; i++) {
                System.out.print(a[rs][i] + " ");
            }
            rs++;
            for (int i = rs; i <= re; i++) {
                System.out.print(a[i][ce] + " ");
            }
            ce--;
            if (rs <= re) {
                for (int i = ce; i >= cs; i--) {
                    System.out.print(a[re][i] + " ");
                }
                re--;
            }
            if (cs <= ce) {
                for (int i = re; i >= rs; i--) {
                    System.out.print(a[i][cs] + " ");
                }
                cs++;
            }
        }
    }
}
