import java.util.Scanner;
public class j17 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        int a ;
        int button;
        int even = 0;
        int odd = 0;
        do {
            a = sc.nextInt();
            
            if(a % 2 == 0)
            {
                even += a;
            }
            else
            {
                odd += a;
            }
            System.out.println("Enter 1 to continue or Enter 0 for printing ");
            button = sc.nextInt();
        } while ( button == 1);
        if(button  == 0){
            System.out.println("The sum of even integers is: "+even + "\n The sum of odd intergers is: " + odd  );
        }
        sc.close();
    }
}
