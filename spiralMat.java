import java.util.Scanner;

public class spiralMat {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] mat = new int[n][m];
            for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
            mat[i][j] = sc.nextInt();
            }
            }
            int[] arr=new int[n*m];
            arr=spiral(mat);
            for(int i=0;i<n*m;i++){
            System.out.print(arr[i]+" ");
            }
        }
        int n2 = 80;
        int[][] mat2 = new int[n2][n2];
        mat2 = spiral2(80);
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[] spiral(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int i = 0, j = 0, mi = 0, mj = 0, c = n * m;
        int count = 0;
        int arr[] = new int[n * m];
        while (count < c) {
            while (j < m && count < c) {
                arr[count] = A[i][j];
                j++;
                count++;
            }
            j--;
            i++;
            m--;
            while (i < n && count < c) {
                arr[count] = A[i][j];
                i++;
                count++;
            }
            i--;
            j--;
            n--;
            while (j >= mj && count < c) {
                arr[count] = A[i][j];
                j--;
                count++;
            }
            j++;
            i--;
            mj++;
            while (i > mi && count < c) {
                arr[count] = A[i][j];
                i--;
                count++;
            }
            i++;
            j++;
            mi++;
        }
        return arr;
    }

    public static int[][] spiral2(int A) {
        int n = A;
        int m = A;
        int i = 0, j = 0, mi = 0, mj = 0, c = n * m;
        int count = 0;
        int[][] arr = new int[n][m];
        while (count <= c) {
            while (j < m && count < c) {
                arr[i][j] = count;
                j++;
                count++;
            }
            j--;
            i++;
            m--;
            while (i < n && count < c) {
                arr[i][j] = count;
                i++;
                count++;
            }
            i--;
            j--;
            n--;
            while (j >= mj && count < c) {
                arr[i][j] = count;
                j--;
                count++;
            }
            j++;
            i--;
            mj++;
            while (i > mi && count < c) {
                arr[i][j] = count;
                i--;
                count++;
            }
            i++;
            j++;
            mi++;
        }
        return arr;
    }
}