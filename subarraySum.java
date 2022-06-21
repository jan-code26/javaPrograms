import java.util.*;
public class subarraySum {
    //function to find subarray with given sum
    public static ArrayList<Integer> findSubarray(int[] arr, int sum) {
        int curr_sum = 0;
        int start = 0;
        int end = 0;
        ArrayList<Integer> subarray = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            curr_sum += arr[i];
            while (curr_sum > sum) {
                curr_sum -= arr[start];
                start++;
            }
            if (curr_sum == sum) {
                end = i;
                //System.out.println("Subarray with given sum is " + sum + " is " + arr[start] + " to " + arr[end]);
                //return in arraylist of start and end index
                subarray.add(start+1);
                subarray.add(end+1);
                
            }
        }
        return subarray;
    }
    //main class
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int sum = 12;
        ArrayList<Integer> subarray = findSubarray(arr, sum);
        //print start and end index of subarray
        System.out.println("Subarray with given sum is " + sum + " is " + subarray.get(0) + " to " + subarray.get(1));
    }
}
//technique:
//1. create a variable curr_sum and initialize it to 0
//2. create a variable start and initialize it to 0
//3. create a variable end and initialize it to 0
//4. create a variable subarray and initialize it to new ArrayList<Integer>()
//5. for loop to iterate through the array
//6. curr_sum += arr[i]
//7. while curr_sum > sum
//8. curr_sum -= arr[start]
//9. start++
//10. if curr_sum == sum
//11. end = i
//12. print the subarray
//13. return in arraylist of start and end index
//14. return subarray
//15. main class
//16. int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//17. int sum = 15;
//18. ArrayList<Integer> subarray = findSubarray(arr, sum);
//19. print start and end index of subarray

