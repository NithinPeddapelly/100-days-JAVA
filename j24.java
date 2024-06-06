public class j24 {
    public static void main(String args[]) {
        int a = 4;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || j == 5 || i == 1 || i == a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
