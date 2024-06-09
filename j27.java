public class j27 {
    public static void main(String args[]){
       int a =5;
       int count = 0;
       for(int i=1;i<=a;i++){
            for(int j = 1;j<=a;j++){
                if(i >= j){
                    count++;
                    System.out.print(count+" ");
                }
            }
            System.out.println();
       }
    }
}
