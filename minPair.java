
/*wants to find the minimum cost to fly every technical panel member to a city 
such that n technical panel members arrive in each city. 
input = 4
costs = 20 60 10 50 40 200 30 300
output = 180

Explanation:
costs[i] = [ACost, BCost]
costs = [[20,60],[10,50],[40,200],[30,300]]

If you go by the minimum cost you might get the cost as below
actualMinimumCost=30 + 40 + 50 + 60 =180
 */
// Language: java
// Path: minCost.java
import java.util.*;

class minPair {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[][] costs = new int[n][3];
            for (int i = 0; i < n; i++) {
                costs[i][0] = sc.nextInt();
                costs[i][1] = sc.nextInt();
            }
            // calculate diffrence btw Acost and Bcost
            // store in the hash map with there index number
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
            // find the minimum diffrence

            for (int i = 0; i < n; i++) {
                hm.put(i, costs[i][0] - costs[i][1]);
            }
            // sort the hash map in ascending order of the diffrence
            // print hash map in ascending order of the diffrence
        }

    }
}