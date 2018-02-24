import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = s.nextInt();
            Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
    }
}
