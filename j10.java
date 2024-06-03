import java.util.Scanner;
public class j10 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        String b = (a < 0)? "Negative" : "Positive";
        System.out.println(b);
        

    }
}
