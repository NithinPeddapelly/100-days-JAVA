public class j30 {
    public static void main(String args[]){
        int a = 5;
        for(int i = 1;i<=a;i++){
            for(int j=0;j<=a;j++){
                if(j+i > a+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=0;j<=a;j++){
                if(j+i <= a){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    }
}
