public class j49_Kadanes_algorithm { //Kadanes algorithm
    public static void kadanes(int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i = 0;i < arr.length;i++){
            cs += arr[i];
            if(cs<0){
                cs = 0;       // original logic "use 0 instead of using negative number"
            }
            ms = Math.max(cs,ms);
        }
        System.out.println(ms);
    }
    public static void main(String args[]){
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);
    }
}
