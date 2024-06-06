public class j22 {
    public static boolean ISeven(int a){
        if(a % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        int a = 781;
        boolean ans = ISeven(a);
        System.out.println(ans);
        
    }
}
