import java.io.*;

class YESorYES {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String s = br.readLine().toLowerCase();

            if (s.equals("yes")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}