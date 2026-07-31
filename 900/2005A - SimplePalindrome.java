import java.util.Scanner;

class SimplePalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        while (t-- > 0) {

            int n = sc.nextInt();

            int q = n / 5;
            int r = n % 5;

            StringBuilder ans = new StringBuilder();

            for (int i = 0; i < 5; i++) {
                int cnt = q + (i < r ? 1 : 0);
                for (int j = 0; j < cnt; j++) {
                    ans.append(vowels[i]);
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}