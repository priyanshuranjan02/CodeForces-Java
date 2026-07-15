import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class FoxNSnake {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean right = true;

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 1) {
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
            } else {
                if (right) {
                    for (int j = 0; j < m - 1; j++) {
                        System.out.print(".");
                    }
                    System.out.print("#");
                } else {
                    System.out.print("#");
                    for (int j = 0; j < m - 1; j++) {
                        System.out.print(".");
                    }
                }
                right = !right;
            }

            System.out.println();
        }
    }
}