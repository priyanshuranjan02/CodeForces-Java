import java.io.*;

class RemovalsGame {
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;

                if (len <= 0) {
                    return -1;
                }
            }

            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;

            do {
                c = read();
            } while (c <= ' ');

            int sign = 1;

            if (c == '-') {
                sign = -1;
                c = read();
            }

            int res = 0;

            while (c > ' ') {
                res = res * 10 + (c - '0');
                c = read();
            }

            return res * sign;
        }
    }

    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();

        while (t-- > 0) {

            int n = fs.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = fs.nextInt();
            }

            boolean same = true;
            boolean reverse = true;

            for (int i = 0; i < n; i++) {

                if (a[i] != b[i]) {
                    same = false;
                }

                if (a[i] != b[n - 1 - i]) {
                    reverse = false;
                }
            }

            if (same || reverse) {
                out.append("Bob\n");
            } else {
                out.append("Alice\n");
            }
        }

        System.out.print(out);
    }
}