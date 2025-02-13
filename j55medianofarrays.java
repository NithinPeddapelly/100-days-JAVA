import java.util.Arrays;  // Median of two SORTED arrays    
public class j55medianofarrays {
    public static void findMedianSortedArrays() {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {5,6,7,8,9};
        int a = nums1.length;
        int b = nums2.length;
        int c = a + b;
        int[] arr = new int[c];

        for (int i = 0; i < a; i++) { 
            arr[i] = nums1[i];
        }

        for (int j = 0; j < b; j++) {
            arr[j + a] = nums2[j];
        }
        Arrays.sort(arr);

        for (int i = 0; i < c; i++) { 
        }

        double median; 
        if (c % 2 == 0) {
            median = (arr[c / 2 - 1] + arr[c / 2]) / 2.0; 
        } else {
            median = arr[c / 2];
        }
        System.out.println(median);
    }

    public static void main(String[] args) {
        findMedianSortedArrays();
    }
}
