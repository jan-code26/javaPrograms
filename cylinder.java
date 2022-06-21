
/*You have three stacks of cylinders where each cylinder has the same diameter, but they may vary in height.
You can change the height of a stack by removing and discarding its topmost cylinder any number of times.

Find the maximum possible height of the stacks such that all of the stacks are exactly the same height. 
This means you must remove zero or more cylinders from the top of zero or more of the three stacks until 
they're all the same height, then print the height. 
The removals must be performed in such a way as to maximize the height.

Note: An empty stack is still a stack.
*/
/*
Input Format
------------
The first line contains three space-separated integers,n1, n2, and n3, describing the respective number 
of cylinders in stacks 1, 2, and 3. 
The subsequent lines describe the respective heights of each cylinder in a stack from top to bottom:

-> The second line contains n1 space-separated integers describing the cylinder heights in stack 1. 
The first element is the top of the stack.
-> The third line contains n2 space-separated integers describing the cylinder heights in stack 2. 
The first element is the top of the stack.
-> The fourth line contains n3 space-separated integers describing the cylinder heights in stack 3. 
The first element is the top of the stack. 

Output Format
-------------
Print a single integer denoting the maximum height at which all stacks will be of equal height.
*/
/*
Sample Input
------------
5 3 4
3 2 1 1 1
4 3 2
1 1 4 1

Sample Output
-------------
5

Explanation:
------------
Explanation

Initially, the stacks look like this:

1 1 1 2 3 8
2 3 4 9
1 4 1 1 7

Observe that the three stacks are not all the same height. 
To make all stacks of equal height, 
we remove the first cylinder(3,4) from stacks 1 and 2, and then remove the top two cylinders(1,1) from stack 3.

As a result, the stacks undergo the following change in height:
1. 8-3   = 5
2. 9-4   = 5
3. 7-1-1 = 5
All three stacks now have height = 5. Thus, we print 5 as our answer.

*/
import java.util.*;

class cylinder {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
			int l1 = sc.nextInt();
			int l2 = sc.nextInt();
			int l3 = sc.nextInt();
			int[] a1 = new int[l1];
			int[] a2 = new int[l2];
			int[] a3 = new int[l3];
			for (int i = 0; i < l1; i++) {
			    a1[i] = sc.nextInt();
			}
			for (int i = 0; i < l2; i++) {
			    a2[i] = sc.nextInt();
			}
			for (int i = 0; i < l3; i++) {
			    a3[i] = sc.nextInt();
			}
			Stack<Integer> arr1 = new Stack<>();
			Stack<Integer> arr2 = new Stack<>();
			Stack<Integer> arr3 = new Stack<>();
			int s1 = 0, s2 = 0, s3 = 0;
			for (int i = l1 - 1; i >= 0; i--) {
			    arr1.push(a1[i]);
			    s1 = s1 + arr1.peek();
			}
			for (int i = l2 - 1; i >= 0; i--) {
			    arr2.push(a2[i]);
			    s2 = s2 + arr2.peek();
			}
			for (int i = l3 - 1; i >= 0; i--) {
			    arr3.push(a3[i]);
			    s3 = s3 + arr3.peek();
			}
			while (s1 != s2 || s1 != s3) {
			    if (arr1.isEmpty() || arr1.isEmpty() || arr1.isEmpty()) {
			        s1 = s2 = s3 = 0;
			        break;
			    }
			    if (s1 >= s2 && s1 >= s3) {
			        s1 = s1 - arr1.pop();
			    } else if (s2 >= s1 && s2 >= s3) {
			        s2 = s2 - arr2.pop();
			    } else {
			        s3 = s3 - arr3.pop();
			    }

			}
			System.out.println(s1);
		}

    }
}