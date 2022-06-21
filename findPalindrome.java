public class findPalindrome {
    //Given a string s, return the number of palindromic substrings in it.
    public static int countPalindrome(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (isPalindrome(s.substring(i, j))) {
                    count++;
                }
            }
        }
        return count;
    }
    //palindrome is a string which is same when reversed
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    //main method
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(countPalindrome(s));
    }
}
