import java.util.Scanner;

public class getRow {
    // return the kth row of the Pascal's triangle.
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
        }
        int n = 2;
        int[] row = new int[n];
        for(int i=0;i<n;i++){
            row[i] = 1;
            for(int j=i-1;j>0;j--){
                row[j] = row[j] + row[j-1];
            }
            for(int j=0;j<=i;j++){
                System.out.print(row[j]+" ");
            }
        }
        System.out.println(row);
    }
}
