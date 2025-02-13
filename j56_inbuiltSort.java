import java.util.Arrays;
public class j56_inbuiltSort {
    public static void main(String args[]){
        Integer arr[] = {4,2,5,4,6,1,0};
        Arrays.sort(arr);
        // Arrays.sort(arr,0,4);   From and to index the selected by the user
        // Arrays.sort(arr,Collections.reverseOrder()); only object type datatype can be reversed in the collections.reverseOrder()
        // we use collections to make it reverse order
        // Arrays.sort(arr,0,5,Collections.reverseOrder()); From and to index the selected by the user
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
