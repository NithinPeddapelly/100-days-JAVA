import java.util.Scanner;
public class j8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String reportCard   = (a > 35)? "Pass" : "Fail";
        System.out.println(reportCard);
    }
    
}
