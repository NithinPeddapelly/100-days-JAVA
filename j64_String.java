import java.util.*;

public class j64_String {
    public static void PrintLetters(String Fullname) {
        for (int i = 0; i < Fullname.length(); i++) {
            System.out.print(Fullname.charAt(i)+" ");
        }
    }

    public static void main(String args[]) {
        // String str = "Nithin";
        // String str2 = new String("abcd");

        // Strings are IMMUTABLE: Cannot be changed.

        // Scanner sc = new Scanner(System.in);
        // String name;
        // String name2;
        // System.out.print("Enter your name :");
        // name = sc.next();
        // name2 = sc.nextLine();
        // System.out.println(name);
        // System.out.println(name2);

        // String fullname = "Tony Stark"; // SPACE is also counted. S0 length is 10
        // System.out.println(fullname.length());

        

        String first = "Nithin";
        String last = "peddapelly";
        String Fullname = first + " " + last; // Concatination
        // // System.out.println(Fullname.charAt(16));
        PrintLetters(Fullname);
    }
}
