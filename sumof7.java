// Given a range [A, B], find sum of integers divisible by 7 in this range using 0(1)
// (A <= B).
class sumof7 {
    public static void main(String[] args) {
        int a = 1;
        int b = 7;
        System.out.println(findsum(a, b));
    }

    // find smallest number divisible by 7 in range [a,b]
    public static int findsmall(int a, int b) {
        if (a % 7 == 0)
            return a;
        else
            return a - a % 7;
    }

    // find largest number divisible by 7 in range [a,b]
    public static int findlarge(int a, int b) {
        if (b % 7 == 0)
            return b;
        else
            return b - (b % 7) + 7;
    }

    // find sum of integers divisible by 7 in this range using 0(1)
    public static int findsum(int a, int b) {
        int small;
        if (a % 7 == 0)
            small = a;
        else
            small = a - a % 7;
        if (small < a) {
            small -= 7;
        }

        int large;
        if (b % 7 == 0)
            large = b;
        else
            large = b - b % 7 + 7;
        if (large > b) {
            large -= 7;
        }

        int n = b / 7 - (a - 1) / 7;
        int sum = n * (small + large) / 2;
        return sum;

    }

}