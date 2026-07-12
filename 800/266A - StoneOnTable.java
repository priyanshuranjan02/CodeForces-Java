import java.util.*;
class StoneOnTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        String stones = sc.next();

        int count = 0;

        for(int i = 1; i < stones.length(); i++) {
            if(stones.charAt(i) == stones.charAt(i - 1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
