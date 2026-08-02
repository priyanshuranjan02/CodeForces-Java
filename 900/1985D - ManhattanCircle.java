import java.util.*;

class ManhattanCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int top = -1;
            int bottom = -1;
            int col = -1;

            for (int i = 0; i < n; i++) {
                String s = sc.next();

                for (int j = 0; j < m; j++) {
                    if (s.charAt(j) == '#') {
                        if (top == -1) {
                            top = i;
                            col = j;
                        }
                        bottom = i;
                    }
                }
            }
            int row = (top + bottom) / 2;
            System.out.println((row + 1) + " " + (col + 1));
        }
    }    
}