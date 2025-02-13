
public class j54insertionsort {
    public static void sort(int arr[]){
        
        for(int i = 1;i<=arr.length-1;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }

        for(int i = 0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={ 8, 5, 61, 5, 48, 2, 32, 3, 5, 65, 532, 3, 1 };
        sort(arr);
    }    
}
