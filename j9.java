import java.util.Scanner;
public class j9 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        switch(a){
            case 1 : System.out.println("Naruto");
            break;
            case 2 : System.out.println("kakashi");
            break;
            case 3 : System.out.println("Obito");
            break;
            default : System.out.println("Wake up to reality");
        }
        sc.close();
    }    
}
