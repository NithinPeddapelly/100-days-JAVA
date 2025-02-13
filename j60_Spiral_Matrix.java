public class j60_Spiral_Matrix {
    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int start_row = 0;
        int start_col = 0;
        int End_row = arr.length - 1;
        int End_col = arr[0].length - 1;

        while (start_row <= End_row && start_col <= End_col) {
            // TOP
            for (int j = start_col; j <= End_col; j++) {
                System.out.print(arr[start_row][j] + " ");
            }
            start_row++;
            // Right
            for (int i = start_row; i <= End_row; i++) {
                System.out.print(arr[i][End_col] + " ");
            }
            End_col--;
            // Botton
            for (int j = End_col; j >= start_col; j--) {
                System.out.print(arr[End_row][j] + " ");
            }
            End_row--;
            // Left
            for (int i = End_row; i >= start_row; i--) {
                System.out.print(arr[i][start_col] + " ");
            }
            start_col++;
            
        }
    }
}