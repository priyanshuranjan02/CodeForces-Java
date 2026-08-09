import java.util.*;

class BeautifulNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int sum = 0;
            ArrayList<Integer> reduce = new ArrayList<>();

            for (int i = 0; i < s.length(); i ++) {
                int d = s.charAt(i) - '0';
                sum += d;

                if (i == 0)
                    reduce.add(d - 1);
                else
                    reduce.add(d);
            }

            Collections.sort(reduce);

            int ans = 0;

            for (int i = reduce.size() - 1; i >= 0 && sum > 9; i--) {
                sum -= reduce.get(i);
                ans++;
            }

            System.out.println(ans);
        }
    }
}