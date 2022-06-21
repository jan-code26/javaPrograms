// /*Given two strings s1 and s2, return the lowest ASCII sum of deleted characters to make two strings equal.

// input =sea
// eat
// --deleting s from sea adds the ASCII value of s(115) to the sum.
// -- deleting t from eat adds 116 to sum
// at the end, both strings are equal, and 115+116=231 is minimum sum possible to achieve this.

// input =delete 
// leet

// deleting dee from delete to turn the string into let.
// add 100(d)+101(e) to the sum
// Deleting "e" from "leet" adds 101[e] to the sum.

// At the end, both strings are equal to "let", and the answer is 100+101+101+101 = 403.
// If instead we turned both strings into "lee" or "eet", we would get answers of 433 or 417, which are higher.

// */
// import java.util.*;
// public class Test1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s1 = sc.next();
//         String s2 = sc.next();
//         int sum = 0;
// //dymamic programming
//         int[][] dp = new int[s1.length()+1][s2.length()+1];
//         for(int i=0;i<=s1.length();i++){
//             for(int j=0;j<=s2.length();j++){
//                 if(i==0 || j==0){
//                     dp[i][j] = 0;
//                 }
//                 else if(s1.charAt(i-1)==s2.charAt(j-1)){
//                     dp[i][j] = dp[i-1][j-1]+1;
//                 }
//                 else{
//                     dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
//                 }
//             }
//         }
//         for(int i=0;i<s1.length();i++){
//             sum += dp[s1.length()][i];
//         }   
//         for(int i=0;i<s2.length();i++){
//             sum += dp[i][s2.length()];
//         }
//         System.out.println(sum);
//     }
// }

// // Java program to find LCM of two numbers.
// class Test
// {
// 	// Recursive method to return gcd of a and b
// 	static int gcd(int a, int b)
// 	{
// 		if (a == 0)
// 			return b;
// 		return gcd(b % a, a);
// 	}
	
// 	// method to return LCM of two numbers
// 	static int lcm(int a, int b)
// 	{
// 		return (a / gcd(a, b)) * b;
// 	}
	
// 	// Driver method
// 	public static void main(String[] args)
// 	{
//     Scanner sc=new Scanner(System.in);
// 		int a = sc.nextInt();
//         int b = sc.nextInt();
// 		System.out.println(lcm(a, b));
// 	}
// }

// // Java program to find all common
// // divisors of N numbers

// class GFG
// {

// // Function to calculate gcd of
// // two numbers
// static int gcd(int a, int b)
// {
// 	if (a == 0)
// 		return b;
// 	return gcd(b % a, a);
// }

// // Function to print all the
// // common divisors
// // static int getans(int arr[], int N)
// // {
// // 	int g = arr[0];

// // 	HashSet<Integer> divisors = new HashSet<Integer>();

// // 	for (int i = 1; i < N; i++)
// // 	{
// // 		g = gcd(arr[i], g);
// // 	}

// // 	for (int i = 1; i * i <= g; i++)
// // 	{
// // 		if (g % i == 0)
// // 		{
// // 			divisors.add(i);
// // 			if (g / i != i)
// // 				divisors.add(g / i);
// // 		}
// // 	}
// //     int temp=0;
// // 	for (int it : divisors)
// //         temp=it;
    
// //         return temp;
// // }

// // public static void main(String[] args)
// // {
// //     Scanner sc=new Scanner(System.in);
    
// // 		int n = sc.nextInt();
// //         int arr[] =new int[n];
// //         for(int i=0;i<n;i++){
// //             arr[i]=sc.nextInt();
// //         }

// // 	// Function to print all the
// // 	// common divisors
// // 	getans(arr, n);
// // }
// // }



