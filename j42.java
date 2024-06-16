public class j42 { // reverse os array
    public static void swaper(int arr[]){
        int temp[] = new int[1];
        int a  = 0;
        int n = arr.length;
        int b = n-1;

        while(a < b){
            temp[0] = arr[a];
            arr[a] = arr[b];
            arr[b] = temp[0];
            a++;
            b--;
        }
        for(int i = 0;i<arr.length;i++){
            System.err.print(arr[i]);
        }

    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        swaper(arr);

    }
}
