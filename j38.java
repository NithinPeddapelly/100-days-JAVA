//Write a Java method to compute the sum of the digits in an integer.
import java.util.*;
public class j38 {
    public static int sumofdigits(int n){
        int sum = 0;
        while(n > 0){
            sum += n;
            n--;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumofdigits(n));
        sc.close();
    }
}
