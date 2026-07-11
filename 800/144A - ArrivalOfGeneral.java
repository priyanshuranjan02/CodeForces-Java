import java.util.*;

class ArrivalOfGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] h = new int[n];

        int max = -1,min = Integer.MAX_VALUE;
        int idxMax = -1, idxMin = -1;

        for(int i = 0; i < n; i++) {
            h[i] = sc.nextInt();

            if(h[i] > max) {
                max = h[i];
                idxMax = i;
            }
            if(h[i] <= min) {
                min = h[i];
                idxMin = i;
            }
        }
        
        int swaps = idxMax + (n - 1 - idxMin);
        if(idxMax > idxMin) {
            swaps--;
        }
        System.out.println(swaps);
    }
}