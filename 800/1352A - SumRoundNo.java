import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class SumRoundNo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine());

            ArrayList<Integer> list = new ArrayList<>();
            int place = 1;

            while (n > 0) {
                int digit = n % 10;

                if (digit != 0) {
                    list.add(digit * place);
                }

                place *= 10;
                n /= 10;
            }

            System.out.println(list.size());

            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.print(list.get(i) + " ");
            }

            System.out.println();
        }
    }
}