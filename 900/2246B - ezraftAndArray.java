import java.io.*;

class ezraftAndArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            if (n == 1) {
                sb.append(1).append('\n');
            } else if (n == 2) {
                sb.append(-1).append('\n');
            } else {
                long[] a = new long[n];
                a[0] = 1;
                a[1] = 2;
                a[2] = 3;
                long S = 6;
                for (int i = 3; i < n; i++) {
                    a[i] = S;
                    S *= 2;
                }
                for (int i = 0; i < n; i++) {
                    sb.append(a[i]);
                    sb.append(i == n - 1 ? '\n' : ' ');
                }
            }
        }

        System.out.print(sb);
    }
}