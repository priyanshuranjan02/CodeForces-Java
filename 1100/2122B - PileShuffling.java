import java.io.*;

class PileShuffling {
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

        long nextLong() throws IOException {
            int c;

            do {
                c = read();
            } while (c <= ' ');

            long num = 0;

            while (c > ' ') {
                num = num * 10 + (c - '0');
                c = read();
            }

            return num;
        }

        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();
            long answer = 0;

            for (int i = 0; i < n; i++) {
                long a = fs.nextLong();
                long b = fs.nextLong();
                long c = fs.nextLong();
                long d = fs.nextLong();

                if (a > c) {
                    answer += a - c;
                    a = c;
                }

                if (b > d) {
                    answer += a + b - d;
                }
            }

            out.append(answer).append('\n');
        }

        System.out.print(out);
    }
}