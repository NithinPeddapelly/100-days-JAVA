//FUNCTIONS QUESTIONS
//Question 1 :Write a Java method to compute the average of three numbers.

import java.util.*;
public class j35 {
    public static int Average(int a,int b,int c){
        return (a+b+c)/3;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int avg = Average(a, b, c);
        System.out.println(avg);
    }
}
