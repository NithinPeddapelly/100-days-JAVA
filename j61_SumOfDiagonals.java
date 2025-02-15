public class j61_SumOfDiagonals {

    public static void diagonal(int arr[][]){
        int PD = 0;
        int SD = 0;
        int length = arr[0].length-1;

        for(int i = 0;i<arr.length;i++){
            for(int j = 0 ;j<arr[0].length;j++){        // Quadratic Time Complexity
                if(i == j){
                    PD += arr[i][j];
                }

                if(i+j == length){
                    if(i==j){
                        break;
                    }
                    else{
                        SD += arr[i][j];
                    }
                }
            }
        }
        // System.out.println(PD);
        // System.out.println(SD);
        int sum = PD + SD;
        System.out.println(sum);
        
    }
    public static void OPTIMISED(int arr[][]){
        int PD = 0; // Primary Diagonal
        int SD = 0; // Secondary Diagonal

        int length = arr[0].length-1;

        for(int i = 0;i< arr.length;i++){       // Linear Time Complexity
            PD += arr[i][i];
        if(i != length-1){
            SD += arr[i][length-i];
        }

        }
        int sum = PD + SD;
        System.out.println(sum);

    }
    public static void main(String args[]){
        // int arr[][] = {{2,5,6,2},
        //                {8,4,6,5},
        //                {4,2,8,3},
        //                {0,8,9,6}};
        
        int arr[][] = {{2,5,6},
                       {8,4,5},
                       {2,8,3},
                       };
        diagonal(arr);
        OPTIMISED(arr);
        
    }
}
