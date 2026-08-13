import java.util.*;

class MultipleConstruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            StringBuilder sb = new StringBuilder();

            for (int i = n; i >= 1; i--) {
                sb.append(i).append(' ');
            }

            sb.append(n);

            for (int i = 1; i < n; i++) {
                sb.append(' ').append(i);
            }

            System.out.println(sb);
        }
    }
}