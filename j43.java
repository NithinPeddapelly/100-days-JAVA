
public class j43 { // pairs in array - printing and counting
    public static void printpairs(int arr[]){
        int b = 0;
        for(int i = 0;i<= arr.length -1;i++){
            int curr = arr[i];
            for(int j = i+1;j<=arr.length-1 ;j++){
                System.out.print("(" + curr + "," + arr[j] + ")");
                b++;
            }
            System.out.println();
        }
        System.out.print("Total number of pairs = "+ b);

    }
    public static void main(String args[]){
        int arr[] = {20,25,30,35,40,45,50,55,60,65};
        printpairs(arr);

    }
    // public static void printpairs(int arr[]){
    //     for(int i = 0;i<= arr.length-1;i++){
    //         int cur = arr[i];
    //         for(int j = i+1;j<=arr.length-1;j++){
    //             System.out.print("("+cur+","+ arr[j]+")");
    //         }
    //         System.out.println();
    //     }

    // }
}
