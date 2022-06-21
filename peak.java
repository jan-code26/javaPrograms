

import java.util.Scanner;

public class peak {
    public static void name() {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int res = findPeak(arr);
            System.out.println(res);
        }

    }

    public static int findPeak(int[] A) {
        int l = 0, r = A.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (A[mid] > A[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return A[l];
    }
}
