import java.util.Scanner;

// Given an array and k , find largest sum of subsequence of nums of length k from array

// Return any such subsequence as an integer array of length k.
public class subsequence {
    //main function
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int[] res = findLargestSum(arr, k);
            for (int i = 0; i < res.length; i++) {
                System.out.print(res[i] + " ");
            }
        }
    }
    public static int[] findLargestSum(int[] arr, int k) {
        //array to store the max sum of subsequence of length k
        int[] res = new int[k];
        //array to store the max sum of subsequence of length n
        int[] dp = new int[arr.length];
        //initialize the first element of dp array
        dp[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            //dp[i] is the max sum of subsequence of length i
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
        }
        //initialize the first element of res array
        res[0] = dp[arr.length - 1];
        for (int i = 1; i < k; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < arr.length - i; j++) {
                max = Math.max(max, dp[j] + dp[j + i]);
            }
            res[i] = max;
        }
        return res;
    }
}
//steps
//1. create an array of length k
//2. create an array of length n
//3. initialize the first element of dp array
//4. for loop to iterate from 1 to n
//5. dp[i] is the max sum of subsequence of length i
//6. initialize the first element of res array
//7. for loop to iterate from 1 to k
//8. int max is Integer.MIN_VALUE
//9. for loop to iterate from 0 to n-i
//10. max is Math.max(max, dp[j] + dp[j+i]) 
//j is the starting index of the subsequence and j+i is the ending index of the subsequence and dp[j] is the sum of the subsequence from index j to j+i
//11. res[i] is the max sum of subsequence of length i
//12. return res