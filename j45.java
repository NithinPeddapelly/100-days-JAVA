public class j45 {
    public static void maxSub(int arr[]) {
        int curSum = 0;
        int Maxsum = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                curSum = 0;

                for (int k = i; k <= j; k++) {
                    curSum += arr[k];
                }
                System.out.println(curSum);
                if (curSum > Maxsum) {
                    Maxsum = curSum;
                }
            }
        }
        System.out.println(Maxsum);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10 };
        maxSub(arr);

    }
}