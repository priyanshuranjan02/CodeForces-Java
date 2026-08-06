import java.util.Scanner;

class StringConstruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (k == n - 1) {
                System.out.println(-1);
                continue;
            }

            int runs = n - k;
            int zeros = (n + 1) / 2;
            int ones = n / 2;

            StringBuilder ans = new StringBuilder();

            for (int i = 1; i <= runs; i++) {
                if ((i & 1) == 1) { // 0-block
                    if (i + 2 > runs) {
                        while (zeros-- > 0)
                            ans.append('0');
                    } else {
                        ans.append('0');
                        zeros--;
                    }

                } else { // 1-block
                    if (i + 2 > runs) {
                        while (ones-- > 0)
                            ans.append('1');
                    } else {
                        ans.append('1');
                        ones--;
                    }
                }
            }

            System.out.println(ans);
        }
    }
}
