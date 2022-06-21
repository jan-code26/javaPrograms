
//display the output in ascending order by the number of 1's in binary format of that number.
// sort the elements in ascending order of frequency of 1's.
import java.util.*;

class countBit {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            // sort array using sort method of java
            Arrays.sort(a);
            // get the frequency of 1's in binary format of each element and find maximum
            // frequency of 1's. using hash map and bitcount method
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
            int max = 0;
            for (int i = 0; i < n; i++) {
                int count = Integer.bitCount(a[i]);
                ;
                hm.put(a[i], count);
                // find max
                if (count > max) {
                    max = count;
                }
            }
            // display the output in ascending order by the number of 1's
            for (int i = 0; i < max; i++) {
                for (int j = 0; j < n; j++) {
                    if (hm.get(a[j]) == i) {
                        System.out.print(a[j] + " ");
                    }
                }
            }
        }
    }
}
//steps 
