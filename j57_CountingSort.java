public class j57_CountingSort {
    public static void main(String args[]) {
        int newarr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 0, 1, 2, 3, 4 };
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < newarr.length; i++) {
            largest = Math.max(largest, newarr[i]);
        }

        int newnewarr[] = new int[largest + 1];
        for (int i = 0; i < newarr.length; i++) {
            int a = newarr[i];
            newnewarr[a]++;

        }
        int c = 0;
        // for (int j = 0; j <= largest; j++) {        // MINE
        //     int b = newnewarr[j];
        //     for (int k = 0; k < b; k++) {
        //         newarr[c] = j;
        //         c++;
        //     }  
        // }
        for(int j = 0;j< newnewarr.length;j++){        // APNA COLLEGE
            while(newnewarr[j] > 0){
                newarr[c] = j;
                c++;
                newnewarr[j]--;
            }
        }
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}
