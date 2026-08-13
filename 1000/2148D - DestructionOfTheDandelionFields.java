import java.util.*;

class DestructionOfTheDandelionFields {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            ArrayList<Long> odd = new ArrayList<>();

            long evenSum = 0;

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();

                if (x % 2 == 0) {
                    evenSum += x;
                } else {
                    odd.add(x);
                }
            }

            if (odd.isEmpty()) {
                System.out.println(0);
                continue;
            }

            Collections.sort(odd, Collections.reverseOrder());

            long answer = evenSum;
            int take = (odd.size() + 1) / 2;

            for (int i = 0; i < take; i++) {
                answer += odd.get(i);
            }
            System.out.println(answer);
        }
    }
}