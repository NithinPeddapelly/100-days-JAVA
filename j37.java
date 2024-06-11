//Question3: Write a Java program to check if a number is a palindrome in Java ?

import java.util.*;

public class j37 {
    public static int pall(int a) {
        int reverseNum = 0;
        while (a > 0) {
            int lastDigit = a % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            a = a / 10;
        }
        return reverseNum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int a = sc.nextInt();
        sc.close();
        int b = pall(a);
        if (a == b) {
            System.out.println(a + " is a palindrome");
        } else {
            System.out.println(a + " is not a palindrome");
        }

    }
}
