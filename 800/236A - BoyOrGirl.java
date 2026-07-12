import java.util.*;
class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();

        HashSet<Character> distinctChars = new HashSet<>();

        for(int i = 0; i < username.length(); i++) {
            distinctChars.add(username.charAt(i));
        }

        int distinctCount = distinctChars.size();

        if(distinctCount % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
