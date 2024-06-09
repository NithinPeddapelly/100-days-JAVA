import java.util.*; // binary to Decimal

public class j33 {
    public static void Convertorrrer(int num) {
        int binNum = num;
        int pow = 0;
        int b = 0;

        while (binNum > 0) {
            int lastnum = binNum % 10;
            b = b + (lastnum * (int) Math.pow(2, pow));
            pow++;
            binNum /= 10;
        }
        System.out.print(b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int binNum = sc.nextInt();
        sc.close();
        Convertorrrer(binNum);
    }
}
