public class peakEle {
    //fuction to find peak element in an array
    //peak element is an element which is greater than its left and right element
    public static int findPeak(int[] arr) {
        int peak = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                peak = i;
                break;
            }
        }
        return peak;
    }
    //main class
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 15, 15, 7, 8, 9, 10};
        int peak = findPeak(arr);
        System.out.println("Peak element is " + peak);
    }
}
