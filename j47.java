public class j47 {
    
    public static int countThrees(int a, int b, int c) {
        int A = a / 3;
        int B = b / 3;
        int C = c / 3;
        int totalCount = A + B + C;
        return totalCount;
    }
    public static int ni(int a, int b, int c) {
        int k = a+b+c;
        int r=0;
        for(int i =2;i<=k;i++){
            if(i % 3 == 0){
                r++;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        int A = 10;
        int B = 0;
        int C = 6;
        
        int result = countThrees(A, B, C);
        int max = ni(A, B, C);
        System.out.println( result);
        System.out.println(max);
    }
}
