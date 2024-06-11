//Question2:Write a method named isEven that accepts an int argument.The
//method should return true if the argument is even,or false otherwise.Also
// write a program to test your method.
import java.util.*;
public class j36 {
    public static Boolean IsEven(int a){
        if (a % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println(IsEven(a));
    }
}
