

import java.util.Scanner;

public class trailingZeroes {
    //main function
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int res = 0;
			while (n > 0) {
			    res += n / 5;
			    n = n / 5;
			}
			System.out.println(res);
		}
    }
}
//steps
//1. declare a variable called n and assign it the value of the input
//2. declare a variable called res and assign it the value of 0
//3. while n is greater than 0
//4. add the quotient of n divided by 5 to res
//5. assign n to the quotient of n divided by 5
//6. print res