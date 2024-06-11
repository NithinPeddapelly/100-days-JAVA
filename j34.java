import java.util.*; // Decimal to Binary

public class j34 {
    public static void DecToBin(int n) {
        int pow = 0;

        int binNum = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n /= 2;
        }
        System.out.println(binNum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        DecToBin(b);
        sc.close();
    }
}
