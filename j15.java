public class j15 {
    public static void main(String args[]){
        int a = 123456789;
        int reverse = 0;
        while(a > 0 ){
            int b = a % 10;
             reverse = (reverse*10)+b;
             a = a/10;
        }
        System.out.println(reverse);

    }
}
