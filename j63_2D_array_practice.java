public class j63_2D_array_practice {
    public static void count(int arr[][], int key) {
        int count = 0;
        int rows = arr.length;
        int colums = arr[0].length;
        int Total = rows * colums;

        for (int i = 0; i < Total; i++) {

            int row = i / colums;
            int colum = i % colums;
            if (arr[row][colum] == key) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void sum(int nums[][]) {
        int sum = 0;

        for (int j = 0; j < nums[0].length; j++) {
            sum += nums[1][j];
        }

        System.out.println(sum);
    }

    public static void Transpose(int arr[][]) {
        int rows = arr.length;
        int colums = arr[0].length;

        int matrix[][] = new int[colums][rows];
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = arr[j][i] ;
            }
        }
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + ",");
            }
        }
    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3 },
                        { 4, 5, 6 } };
        int key = 4; // key to search
        // count(arr, key);

        int nums[][] = { { 1, 4, 9 }, // row 1
                { 11, 4, 3 }, //row 2
                { 2, 2, 3 } }; // row 3
        // sum(nums);
        Transpose(arr);
    }
}
