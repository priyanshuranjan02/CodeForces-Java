import java.util.*;

class FollowingTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] freq = new int[26];
            StringBuilder ans = new StringBuilder();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                for (int j = 0; j < 26; j++) {
                    if (freq[j] == x) {
                        ans.append((char) ('a' + j));
                        freq[j]++;
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}