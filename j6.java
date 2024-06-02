import java.util.Scanner;

public class j6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int factors = 0;

        for (int i=1; i<=Math.sqrt(a); i++){
            
            if (a % i == 0){
                factors++;
                if (i != a/i){
                    factors++;
                }
            }
        }
        if(factors == 2){
            System.out.println("Number of factors = " + factors +" So "+ a + " is a Prime number");

        }
        else{
            System.out.println("Number of factors = " + factors + " So " + a + " is a Not prime number");
        }
    }
}
