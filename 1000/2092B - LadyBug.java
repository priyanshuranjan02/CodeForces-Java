import java.util.*;

class LadyBug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();

            int zerosGroup1 = 0;
            int requiredGroup1 = 0; 

            int zerosGroup2 = 0;
            int requiredGroup2 = 0;
            
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    if (a.charAt(i) == '0') {
                        zerosGroup1++;
                    }

                    if (b.charAt(i) == '0') {
                        zerosGroup2++;
                    }

                    requiredGroup1++;
                } else {
                    if (b.charAt(i) == '0') {
                        zerosGroup1++;
                    }

                    if (a.charAt(i) == '0') {
                        zerosGroup2++;
                    }

                    requiredGroup2++;
                }
            }

            if (zerosGroup1 >= requiredGroup1 &&
                zerosGroup2 >= requiredGroup2) {

                System.out.println("YES");

            } else {
                System.out.println("NO");
            }
        }
    }
}