public class j50_Tapping_RainWater {
    public static void trap(int arr[]) {
        int num = arr.length;
        int maxleft[] = new int[num];
        int maxright[] = new int[num];
        int maxL = arr[0];
        int maxR = arr[num-1];
        maxleft[0] = maxL;
        maxright[num-1] = maxR;
        int store = 0;

        for (int i = 1; i < num; i++) {
            if (arr[i] > maxL) {
                maxL = arr[i];
                maxleft[i] = maxL;
            }
            else{
                maxleft[i] = maxL;
            }
        }
        for (int i = num-2; i >= 0; i--) {
            if(arr[i] > maxR){
                maxR = arr[i];
                maxright[i] = maxR;
            }else{
                maxright[i] = maxR;
            }
        }
        for (int i = 1; i < num; i++) {
            int level = Math.min(maxleft[i],maxright[i]);
            int water = (level - arr[i])*1;
            System.out.print(water+" ");
            store += water;
        }
        System.out.println();
        System.out.print(store);
    }

    public static void main(String args[]) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        trap(arr);
    }
}
