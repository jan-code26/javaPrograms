import java.util.*;

public class pairSum {
    //function to find pair of elements in an array whose sum is equal to a given number and return count of such pairs with repetitions using map
    public static int findPair(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                count += map.get(arr[i]);
            }
            map.put(sum - arr[i], map.getOrDefault(sum - arr[i], 0) + 1);
        }
        return count;
    }
    //main class
    public static void main(String[] args) {
        int[] arr = {1, 5,5,5,5,7};
        int sum = 10;
        int count = findPair(arr, sum);
        System.out.println("Number of pairs with given sum is " + count);
    }
}
