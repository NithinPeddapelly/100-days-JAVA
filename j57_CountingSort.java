public class j57_CountingSort {
    public static void main(String args[]) {
        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 0, 1, 2, 3, 4 };
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int newarr[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            newarr[a]++;

        }
        int c = 0;
        for (int j = 0; j <= largest; j++) {        // MINE
            int b = newarr[j];
            for (int k = 0; k < b; k++) {
                arr[c] = j;
                c++;
            }  
        }
        // for(int j = 0;j< newarr.length;j++){        // APNA COLLEGE
        //     while(newarr[j] > 0){
        //         arr[c] = j;
        //         c++;
        //         newarr[j]
        //     }
        // }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
