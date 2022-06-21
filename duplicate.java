/*In this game, the player needs to find out the most frequently picked card number, 
from a deal of cards . If there is more than one such card number, display the smallest of 
them.
Example

Lets say there are five cards dealth, with numbers 0 0 1 1 2
The cards with the numbers 0 and 1 appeared the most number of times
The smallest number among them is 0

Input format 
The first line contains the number of cards in the deal.
The second line lists down the card numberrs, each separated by a single space.

Output format 
The smallest of the most frequently dealt card numbers.

Sample input
6
1 4 4 4 53
Sample output
4
 */

import java.util.*;

class duplicate {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Map<Integer, Integer> m = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (m.containsKey(a[i])) {
                    m.put(a[i], m.get(a[i]) + 1);
                } else {
                    m.put(a[i], 1);
                }
            }
            // iterate through the map and find most repeated element and print it
            int max = 0;
            int max_key = 0;
            for (Map.Entry<Integer, Integer> e : m.entrySet()) {
                if (e.getValue() > max) {
                    max = e.getValue();
                    max_key = e.getKey();
                }
                // if there are multiple max values, print the smaller one
                else if (e.getValue() == max) {
                    if (e.getKey() < max_key) {
                        max_key = e.getKey();
                    }
                }
            }
            System.out.println(max_key);

        }
    }
}