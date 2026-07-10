import java.util.*;
class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        int upper = 0;
        int lower = 0;

        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(Character.isUpperCase(c)) {
                upper++;
            } else {
                lower++;
            }
        }
        if(upper > lower) {
            System.out.println(word.toUpperCase());
        } else {
            System.out.println(word.toLowerCase());
        }
    }
}
