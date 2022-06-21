import java.util.*;

public class sumRange {
    
    public static void main() {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int T = sc.nextInt();
            //int X = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            // find index where T fits in array A
            int index = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] >= T) {
                    index = i;
                    break;
                }
            }
            index = index - 1;
            // print elements on index

            System.out.print(A[index] + " ");
        }
    }
}
