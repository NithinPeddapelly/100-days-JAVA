//Array practice
import java.util.*;
 public class j39{
    public static void mona(int arr[]){  // pass by reference
       for(int i =0;i<arr.length;i++){
        arr[i] = arr[i] + 1000;
       }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a = sc.nextInt(); // array size input

        int arr[] = new int[a];
        System.out.println("Enter the data of array");
        for(int i = 0; i<arr.length; i++){ // data input with for loop
            arr[i] = sc.nextInt();
        }
        mona(arr);  // function call
        for(int i = 0; i<arr.length; i++){ // printing with for loop
            System.out.println(arr[i]);
        }
        
        sc.close();

        

    }
 }