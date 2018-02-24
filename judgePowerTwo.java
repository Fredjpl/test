public class judgePowerTwo {
    private static boolean judgePowerTwo(int n)
    {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(judgePowerTwo(256));
    }
}
