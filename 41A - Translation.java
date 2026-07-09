import java.util.*;
class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next().trim();
        String t = sc.next().trim();

        StringBuilder reversed = new StringBuilder(s);
        reversed.reverse();

        if(reversed.toString().equals(t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

