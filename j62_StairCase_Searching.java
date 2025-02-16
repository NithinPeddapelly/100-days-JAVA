public class j62_StairCase_Searching {
    public static boolean OneWay(int arr[][],int key){
        int row = 0 , column = arr[0].length-1;

        while( row < arr.length && column >= 0){

            if(arr[row][column] == key){
                System.out.println("Found key at "+"("+row+","+column+")");
                return true;
            }
            else if(key < arr[row][column]){
                column--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key Not found! ");
        return false;
    }
    public static boolean Otherway(int arr[][],int key){
        int row = arr[0].length-1, column = 0;

        while( row > 0 && column < arr.length){
            if(arr[row][column] == key){
                System.out.println("Found at "+"("+row+","+column+")");
                return true;
            }
            else if(key < arr[row][column]){
                row--;
            }
            else{
                column++;
            }
        }
        System.out.println("Not found !");
        return false;
    }
    public static void main (String args[]){
        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int key = 111;
        // OneWay(arr,key);
        Otherway(arr,key);
    }
    
}
