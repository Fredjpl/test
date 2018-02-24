import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] a = new int[26][26];
        for (int i = 0; i < 20; i++)
            for (int j = 3; j < 23; j++)
                a[i][j] = s.nextInt();
        int t = 0;
        int max = 0;
        for (int i = 0; i < 20; i++)
            for (int j = 3; j < 23; j++) {
                t = a[i][j] * a[i][j + 1] * a[i][j + 2] * a[i][j + 3];
                if (t > max)
                    max = t;
                t = a[i][j] * a[i + 1][j] * a[i + 2][j] * a[i + 3][j];
                if (t > max)
                    max = t;
                t = a[i][j] * a[i + 1][j + 1] * a[i + 2][j + 2] * a[i + 3][j + 3];
                if (t > max)
                    max = t;
                t = a[i][j]*a[i+1][j-1]*a[i+2][j-2]*a[i+3][j-3];
                if (t > max)
                    max = t;
            }
        System.out.print(max);
    }

}
