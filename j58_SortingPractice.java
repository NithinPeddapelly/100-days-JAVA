public class j58_SortingPractice { // algorithms tosort an array in DESCENDING order
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void bubblesort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
    }
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i]; // Current element to be inserted
            int curr = i - 1; // Last element of the sorted portion

            // Shift elements of arr[0..i-1] that are less than temp to one position ahead
            while (curr >= 0 && arr[curr] < temp) {   // arr[curr] < temp changes it it accending and decending order.
                arr[curr + 1] = arr[curr];
                curr--;
            }
            // Insert temp at the correct position
            arr[curr + 1] = temp;
        }
    }
    

    public static void main(String args[]) {
        int arr[] = { 15, 4, 3, 4, 9, 7, 8, 4, 41, 1, 5, 4, 7, 0 };
        insertionSort(arr);
        printarr(arr);

    }
}
