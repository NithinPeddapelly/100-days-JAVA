public class j53selectionsort {
    public static void sortt(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minpos = i;

            for (int j = i+1; j < arr.length - 1; j++) {

                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]) {
        int arr[] = { 8, 5, 61, 5, 48, 2, 32, 3, 5, 65, 532, 3, 1 };
        sortt(arr);

    }
}
