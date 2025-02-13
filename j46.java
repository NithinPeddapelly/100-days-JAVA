
public class j46 {
    public static void SubarrPrefix(int arr[]) {
        int currentSum = 0;
        int Maxsum = Integer.MIN_VALUE;

        int AddArray[] = new int[arr.length];
        AddArray[0] = arr[0];

        for (int i = 1; i < AddArray.length; i++) {

            AddArray[i] = AddArray[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = 1; j < arr.length; j++) {
                currentSum = i == 0 ? AddArray[j] : AddArray[j] - AddArray[i - 1];

                if (Maxsum < currentSum) {
                    Maxsum = currentSum;
                }
            }
        }
        System.out.println(Maxsum);
    }

    public static void main(String args[]) {
        int arr[] = { 1,-2,7, -1,3 };
        // int arr[] = { 2,4,6,8,10,12 };
        SubarrPrefix(arr);
    }
}
