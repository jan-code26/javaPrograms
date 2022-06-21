

public class reverseInt {
    public static void main(String args[]) {
        int n = -1146467285;
        // if greater than 32 bit signed integer which is 2147483647
        if (n > Integer.MAX_VALUE/10 || n < Integer.MIN_VALUE/10) {
            System.out.println(0);
        } else {
            int rev = 0;
            while (n != 0) {
                rev = rev * 10 + n % 10;
                n = n / 10;
            }
            System.out.println(rev);
        }
    }

}
