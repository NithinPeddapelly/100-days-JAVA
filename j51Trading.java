public class j51Trading {
    public static int tradef(int arr[]){
        int buyingPrice = Integer.MAX_VALUE;
        int Maxprofit = 0;
        for(int i = 0;i<arr.length;i++){
       
            if(buyingPrice < arr[i] ){
                int profit = arr[i] - buyingPrice;
                Maxprofit = Math.max(Maxprofit,profit);
            }
            else{
                buyingPrice = arr[i];
            }
        }
        return Maxprofit;
    }
    public static void main(String args[]){
        int arr[] = {7,1,5,3,6,4};
        System.out.println(tradef(arr));
    }
}
