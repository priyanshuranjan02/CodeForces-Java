import java.util.*;

class Pathless {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] a = new int[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }

            if (s < sum) {
                // Any arrangement works
                for (int x : a) {
                    System.out.print(x + " ");
                }
                System.out.println();

            } else if (s == sum) {
                System.out.println("-1");

            } else if (s == sum + 1) {
                // Print all 0s
                for (int x : a) {
                    if (x == 0) {
                        System.out.print("0 ");
                    }
                }

                // Print all 2s
                for (int x : a) {
                    if (x == 2) {
                        System.out.print("2 ");
                    }
                }

                // Print all 1s
                for (int x : a) {
                    if (x == 1) {
                        System.out.print("1 ");
                    }
                }

                System.out.println();

            } else {
                System.out.println("-1");
            }
        }
    }
}