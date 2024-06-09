import java.util.*;
public class j29 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1;i<=a;i++){
            for(int j =1;j<=a;j++)
            {
                if(i>=j ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=a;j>=1;j--)
            {
                if(j>i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=a;i>=1;i--){
            for(int j =1;j<=a;j++)
            {
                if(i>=j ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=a;j>=1;j--)
            {
                if(j>i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        sc.close();

    }
}
