import java.io.*;
import java.util.*;

class MergeToMatch {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(System.in, 1 << 16));
        int t = nextInt(in);
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = nextInt(in);
            int m = nextInt(in);
            long[] a = new long[n];
            long[] b = new long[m];
            for (int i = 0; i < n; i++) a[i] = nextInt(in);
            for (int i = 0; i < m; i++) b[i] = nextInt(in);
            Arrays.sort(a);
            Arrays.sort(b);

            boolean ok = true;
            if (n < 2L * m) {
                ok = false;
            } else {
                for (int i = 0; i < m; i++) {
                    long low = a[i];
                    long high = a[n - m + i];
                    if (!(low < b[i] && high > b[i])) {
                        ok = false;
                        break;
                    }
                }
            }
            sb.append(ok ? "YES" : "NO").append('\n');
        }
        System.out.print(sb);
    }

    private static int nextInt(DataInputStream in) throws IOException {
        int ret = 0;
        int b = in.read();
        while (b < '0' || b > '9') {
            if (b == '-') break;
            b = in.read();
        }
        boolean neg = false;
        if (b == '-') { neg = true; b = in.read(); }
        while (b >= '0' && b <= '9') {
            ret = ret * 10 + (b - '0');
            b = in.read();
        }
        return neg ? -ret : ret;
    }
}