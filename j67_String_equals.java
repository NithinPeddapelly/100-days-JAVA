import java.util.*;
public class j67_String_equals {
    public static void substr(String s2, int start, int end) {
        String SubString = "";
        for (int i = start; i < end - 1; i++) {
            SubString +=(s2.charAt(i)+" ");
            // System.out.println(SubString);  // Funny :)
        }
        System.out.println(SubString);
    }

    public static void main(String args[]) {
        String s1 = "Tony Stark";
        String s2 = new String("NITHIN");
        String s3 = "Tony Stark";
       
        System.out.println("Enter Starting index and ending index :");
        Scanner sc = new Scanner(System.in);
        int Start = sc.nextInt();
        int end = sc.nextInt();

        // if (s1.equals(s2)) {
        //     System.out.println("Equal");
        // } else {
        //     System.out.println("Not Equal");
        // }

        // substr(s2,Start,end);

        // We have an inbuilt function for substring (___.substring(_,_))

        System.out.println(s1.substring(0,5));
    }
}
