import java.util.Scanner;

class GameColoredMarbles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] freq = new int[n + 1];

            for (int i = 0; i < n; i++) {
                freq[sc.nextInt()]++;
            }

            int single = 0;
            int multi = 0;

            for (int i = 1; i <= n; i++) {
                if (freq[i] == 1)
                    single++;
                else if (freq[i] > 1)
                    multi++;
            }

            int ans = multi + ((single + 1) / 2) * 2;

            System.out.println(ans);
        }

        sc.close();
    }
}