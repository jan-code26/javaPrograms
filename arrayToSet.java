import java.util.*;

public class arrayToSet {
    //arraylist to hashset
    public static void arrayToSets(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
    }
    //hashset to arraylist
    public static void setsToArray(Set<Integer> set) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i : set) {
            array.add(i);
        }
        System.out.println(array);
    }
    //sort arraylist
    public static void sortArray(ArrayList<Integer> array) {
        Collections.sort(array);
        System.out.println(array);
    }
    //main class
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 8,9, 10};
        arrayToSets(arr);
    }
}
