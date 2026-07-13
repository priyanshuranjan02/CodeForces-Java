import java.util.*;
class WordCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        if(word.length() > 0) {
            String result = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            System.out.println(result);
        }
    }
}