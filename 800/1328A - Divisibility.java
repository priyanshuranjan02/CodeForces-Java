import java.util.*;

class Divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            long a = sc.nextInt();
            long b = sc.nextInt();

            long rem = a % b;
            System.out.println(rem == 0 ? 0 : b - rem);
        }
    }    
}