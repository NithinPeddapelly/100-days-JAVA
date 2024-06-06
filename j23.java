public class j23 {
    public static int sumofdigits(int a){
        int add = 0;
        while(a > 0){

            int dig = a % 10; // retrive digit

            a /= 10; // delete digit

            add = add + dig ; // add this digit to add
        }
        return add;
    }

    public static void main(String args[]){
        int a = 1000;
        int ans =  sumofdigits(a);
        System.out.println(ans);
    }
}
