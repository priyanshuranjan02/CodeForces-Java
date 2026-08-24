import java.util.*;

class NumericStringTemplate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int m = sc.nextInt();

            while (m-- > 0) {
                String s = sc.next();

                if (s.length() != n) {
                    System.out.println("NO");
                    continue;
                }

                HashMap<Integer, Character> numToChar = new HashMap<>();
                HashMap<Character, Integer> charToNum = new HashMap<>();

                boolean possible = true;

                for (int i = 0; i < n; i++) {
                    int num = a[i];
                    char ch = s.charAt(i);

                    if (numToChar.containsKey(num)) {
                        if (numToChar.get(num) != ch) {
                            possible = false;
                            break;
                        }
                    } else {
                        numToChar.put(num, ch);
                    }

                    if (charToNum.containsKey(ch)) {
                        if (charToNum.get(ch) != num) {
                            possible = false;
                            break;
                        }
                    } else {
                        charToNum.put(ch, num);
                    }
                }
                System.out.println(possible ? "YES" : "NO");
            }
        }
    }
}