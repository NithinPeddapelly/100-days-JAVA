public class j41 {  // BINARY SEARCH
    public static int binarySorting(int arr[] , int key){
        int start = 0;
        int end = arr.length -1;
        
        while(start <= end){
            int mid = (start + end)/2;
            
            if( arr[mid] == key){ // this is the found condition
                return mid ;
            }
            if(arr[mid] < key){
                start = mid +1; //Right
            }
            else{
                end = mid-1; // Left
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int key = 4;
        int a = binarySorting(arr , key);
        if (a == -1){
            System.err.println(" Key not found ");
        } else {
            System.err.println( key + " found at " + a);
        }
    }
    
}
