import java.util.*;
class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();    

        while(++year > 0) {
            String s = String.valueOf(year);
            if(s.chars().distinct().count() == s.length()) {
                System.out.println(year);
                break;
            }
        }
    }
}