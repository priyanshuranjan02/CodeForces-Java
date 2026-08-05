import java.util.Scanner;

class UnnaturalLanguageProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        StringBuilder output = new StringBuilder();

        for (int tc = 0; tc < t; tc++) {
            // blank line before each test case in the sample; skip empty lines
            String line = sc.nextLine();
            while (line.trim().isEmpty()) {
                line = sc.nextLine();
            }
            int n = Integer.parseInt(line.trim());
            String s = sc.nextLine().trim();

            StringBuilder res = new StringBuilder();
            int i = n; // current end index (exclusive) of remaining unprocessed prefix

            while (i > 0) {
                char last = s.charAt(i - 1);
                int x = (last == 'a' || last == 'e') ? 2 : 3;

                // append these x characters (in original order) before what's already in res
                res.insert(0, s.substring(i - x, i));
                if (i - x > 0) {
                    res.insert(0, '.');
                }
                i -= x;
            }

            output.append(res).append('\n');
        }

        System.out.print(output);
    }
}