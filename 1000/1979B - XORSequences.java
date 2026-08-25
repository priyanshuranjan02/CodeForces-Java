import java.util.*;

class XORSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();

            long answer = 1;

            while ((x & 1) == (y & 1)) {
                x >>= 1;
                y >>= 1;
                answer *= 2;
            }
            
            System.out.println(answer);
        }
    }
}