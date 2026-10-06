import java.util.*;
import java.io.*;

class Medians {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());

            if (n == 1) {
                sb.append("1\n1\n");
                continue;
            }

            if (k == 1 || k == n) {
                sb.append("-1\n");
                continue;
            }

            long p2 = k - (k % 2);
            long p3 = k + 1 + (k % 2);

            sb.append("3\n");
            sb.append(1).append(" ").append(p2).append(" ").append(p3).append("\n");
        }

        System.out.print(sb);
    }
}