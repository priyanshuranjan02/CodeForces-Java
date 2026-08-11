import java.util.*;

class BeautifulString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            ArrayList<Integer> ans = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    ans.add(i + 1);
                }
            }

            System.out.println(ans.size());

            for (int i = 0; i < ans.size(); i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(ans.get(i));
            }
            System.out.println();
        }
    }
}