import java.io.*;

class ShiftsAndSorting {
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        String next() throws IOException {
            StringBuilder sb = new StringBuilder();
            int c;

            do {
                c = read();
            } while (c <= ' ');

            while (c > ' ') {
                sb.append((char) c);
                c = read();
            }

            return sb.toString();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();

        while (t-- > 0) {

            String s = fs.next();

            long ans = 0;
            long ones = 0;

            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == '1') {
                    ones++;
                } else if (ones > 0) {
                    ans += ones + 1;
                }
            }

            out.append(ans).append('\n');
        }

        System.out.print(out);
    }
}