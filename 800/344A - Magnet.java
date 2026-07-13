import java.util.*;
class Magnet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String prev = sc.next();
        int groups = 1;

        while(--n > 0) {
            String curr = sc.next();
            if(!curr.equals(prev)) groups++;
            prev = curr;
        }
        System.out.println(groups);
    }
}