public class missingNo {
    //function to fing sum of all intigers in range n
    public static long sumOfIntegers(long n) {
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    //function to find missing number by subtracting sum of all intigers in range n from sum of all intigers in vector
    public static long findMissingNo(long[] arr, long n) {
        long sum = sumOfIntegers(n);
        long sumOfArray = 0;
        for (long i : arr) {
            sumOfArray += i;
        }
        return sum - sumOfArray;
    }
    //main class
    public static void main(String[] args) {
        long[] arr = {1, 2, 3, 5};
        long n = 5;
        long missingNo = findMissingNo(arr, n);
        System.out.println("Missing number is " + missingNo);
    }
}
