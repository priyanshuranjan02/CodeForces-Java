import java.io.*;

class AmusingJoke {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String guest = br.readLine();
        String host = br.readLine();
        String pile = br.readLine();

        int[] freq = new int[26];

        for (char ch : guest.toCharArray()) {
            freq[ch - 'A']++;
        }

        for (char ch : host.toCharArray()) {
            freq[ch - 'A']++;
        }

        for (char ch : pile.toCharArray()) {
            freq[ch - 'A']--;
        }

        for (int count : freq) {
            if (count != 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}