import java.util.Scanner;
public class j18 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t=1;
        int num = sc.nextInt();
        
        for(int i=1;i<=num;i++){
           t *=i;
        }
        System.out.println(t);
        sc.close();
    }
}
