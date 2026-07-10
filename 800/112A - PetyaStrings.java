import java.util.*;
class PetyaStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();

        int result = aLower.compareTo(bLower);

        if(result < 0) {
            System.out.println(-1);
        } else if (result > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}