import java.util.*;

public class j19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int table = 0;
            table = i * a;
            System.out.println(a + "X" + i + "=" + table);

        }
        sc.close();
    }
}
