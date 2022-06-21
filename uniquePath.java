
import java.util.Scanner;
public class uniquePath {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int[][] dp=new int[a][b];
			//initialize the first row and first column
			for(int i=0;i<a;i++){
			    dp[i][0]=1;
			}
			for(int i=0;i<b;i++){
			    dp[0][i]=1;
			}
			//fill the rest of the matrix
			//dp[i][j] = dp[i-1][j] + dp[i][j-1]
			for(int i=1;i<a;i++){
			    for(int j=1;j<b;j++){
			        dp[i][j]=dp[i-1][j]+dp[i][j-1];
			    }
			}
			System.out.println(dp[a-1][b-1]);
		}
    }
}
