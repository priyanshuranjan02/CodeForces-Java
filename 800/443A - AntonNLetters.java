import java.util.*;
import java.io.*;

class AntonNLetters {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        HashSet<Character> set = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
        }
        System.out.println(set.size());
    }
}