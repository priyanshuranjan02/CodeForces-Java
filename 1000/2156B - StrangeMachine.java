import java.util.Scanner;

class StrangeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            String s = sc.next();

            boolean hasB = s.indexOf('B') != -1;

            StringBuilder output = new StringBuilder();

            for (int query = 0; query < q; query++) {
                long x = sc.nextLong();

                long answer;

                if (!hasB) {
                    answer = x;
                } else {
                    long steps = 0;
                    int pos = 0;

                    while (x > 0) {
                        if (s.charAt(pos) == 'A') {
                            x--;
                        } else {
                            x /= 2;
                        }
                        steps++;
                        pos++;

                        if (pos == n) {
                            pos = 0;
                        }
                    }

                    answer = steps;
                }

                if (query > 0) {
                    output.append(' ');
                }

                output.append(answer);
            }
            System.out.println(output);
        }
    }
}