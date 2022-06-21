import java.util.*;
//Treenode class for tree
class Tree {
    int val;
    Tree left;
    Tree right;
    Tree(int x) { val = x; }
}
//binary tree zigzag level order traversal
public class ZigZagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(Tree root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null) return result;
        Queue<Tree> queue = new LinkedList<Tree>();
        queue.offer(root);
        boolean leftToRight = true;
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<Integer>();
            for(int i = 0; i < size; i++) {
                Tree node = queue.poll();
                if(leftToRight) {
                    level.add(node.val);
                } else {
                    level.add(0, node.val);
                }
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(level);
            leftToRight = !leftToRight;
        }
        return result;
    }
    //main method
    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right.left = new Tree(6);
        root.right.right = new Tree(7);
        ZigZagLevelOrder zigzag = new ZigZagLevelOrder();
        List<List<Integer>> result = zigzag.zigzagLevelOrder(root);
        for(List<Integer> level : result) {
            for(int i : level) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
//steps
//1. create a queue and add root to it
//2. create a boolean variable to indicate whether to add elements from left to right or right to left
//3. create a list to store the result
//4. while queue is not empty
//5.     create a list to store the current level
//6.     create a variable to store the size of the queue
//7.     for each element in the queue
//8.         if left to right
//9.             add the element to the list
//10.         else
//11.             add the element to the list at the beginning
//12.         if left child is not null
//13.             add left child to the queue
//14.         if right child is not null
//15.             add right child to the queue
//16.     add the list to the result
//17.     change the boolean variable
//18. return the result


