import java.util.*;

public class j59_2darrayCreation {
    public static Boolean finder(int matrix[][],int key){
        for(int i =0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("Key found at index" + "("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][5]; // Creating the 2D array

        int n = matrix.length; // finding length of rows
        int m = matrix[0].length; // finding out the length of columns in the matrix, it gives length of 0th index row.
        System.out.print("Enter 15 number followed by spaces :");
        for (int i = 0; i < n; i++) { // outer loop for row iteration
            for (int j = 0; j < m; j++) { // inner loop for column iteration
                matrix[i][j] = sc.nextInt(); // taking input into 2D array
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the key value : ");
        int key = sc.nextInt(); 
        finder(matrix, key);
    }
}
