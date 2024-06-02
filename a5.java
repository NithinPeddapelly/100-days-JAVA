import java.util.Scanner;
public class a5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float bill = pen+pencil+eraser;
        float tax = bill * 0.18f;
        float finalBill = bill + tax;

        System.out.println("the total is " + finalBill);

    }
}
