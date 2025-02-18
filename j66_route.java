public class j66_route {
    public static void Route(String direction) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < direction.length(); i++) {      // linear time complexity O(n) ;
            if (direction.charAt(i) == 'W') {
                x--;
            } else if (direction.charAt(i) == 'S') {
                y--;
            } else if (direction.charAt(i) == 'E') {
                x++;
            } else {
                y++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        float displacement = (float) Math.sqrt(X2 + Y2);

        System.out.println(displacement);
    }

    public static void main(String args[]) {
        String direction = "NS"; //WNEENESENNN
        Route(direction);
    }
}
