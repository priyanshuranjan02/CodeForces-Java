import java.util.*;
class NotQuitePalindStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int count0 = 0, count1 = 0;
            for(char c : s.toCharArray()) {
                if(c == '0') {
                    count0++;
                } else {
                    count1++;
                }
            }
            int mn = Math.max(count0, count1) - (n / 2);
            if(mn < 0) {
                mn = 0;
            }
            int max = (count0 / 2) + (count1 / 2);

            boolean ok = (k >= mn && k <= max && ((k - mn) % 2 == 0));
            System.out.println(ok ? "YES" : "NO");
        }
    }
}