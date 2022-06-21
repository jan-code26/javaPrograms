

import java.util.Scanner;

public class Palindrome2 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int str = sc.nextInt();
            System.out.println(isPalindrome(str));
        }
    }

    public static boolean isPalindrome(int A) {
        String str = Integer.toString(A);
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
