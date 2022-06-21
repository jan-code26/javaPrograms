/*CAROM-CHALLENGE

Two players A and B play a 3-level game. The scores of A and B at each level are stored in 
arrays P and Q respectively. At each level, the winner gets one point and the loser gets 
zero points. If Its a tie then no one will get a point. Find the total points scored by the 
players by comparing the scores at each level. 

Example

lets says score of A and B are P[N]=[1,2,3] and Q[N]=[3,2,1]
Now compare the scores at each level and calculate the points score by A & B. 
Print the total points scored i.e = Y=[1,1].

input format 
The first line contains A's score in each level separated by a single space.
The second line contains B's score in each level separated by a single space.

Output format
Total points socred by both the players, each separated by a single space

Sample input
5 6 7
3 6 10
Sample output
1 1
} */
import java.util.*;
class caromchal {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            // split string by no space
            String[] str1 = s1.split(" ");
            ArrayList<String> p1 = new ArrayList<String>(
            		Arrays.asList(str1));
            List<Integer> lst1 = new ArrayList<Integer>();
            for (String fav : p1) {
            	lst1.add(Integer.parseInt(fav.trim()));
            }

            String[] str2 = s2.split(" ");
            ArrayList<String> p2 = new ArrayList<String>(
            		Arrays.asList(str2));
            List<Integer> lst2 = new ArrayList<Integer>();
            for (String fav : p2) {
            	lst2.add(Integer.parseInt(fav.trim()));
            }
            int n1 = 0, n2 = 0;
            for (int i = 0; i < lst1.size(); i++) {
            	if (lst1.get(i) == lst2.get(i)) {
            		continue;
            	} else if (lst1.get(i) > lst2.get(i)) {
            		n1++;
            	}
            	else{
            		n2++;
            	}
            }
            
            System.out.println(n1+" "+n2);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            e.printStackTrace();
        }
	}

}