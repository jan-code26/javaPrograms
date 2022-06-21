import java.util.*;

public class treeTraversal {
    // print tree in inorder
    public static void inorder(TreeNode root) {
        if(root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    // print tree in preorder
    public static void preorder(TreeNode root) {
        if(root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    // print tree in postorder
    public static void postorder(TreeNode root) {
        if(root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data +  " ");
        }
    }
    // print tree in levelorder
    public static void levelorder(TreeNode root) {
        if(root == null) {
            return;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode temp = q.remove();
            System.out.print(temp.data + " ");
            if(temp.left != null) {
                q.add(temp.left);
            }
            if(temp.right != null) {
                q.add(temp.right);
            }
        }
    }
    // main function
    public static void main(String[] args) {
        TreeNode root = null;
        root = TreeNode.insert(root, 10);
        root = TreeNode.insert(root, 20);
        root = TreeNode.insert(root, 30);
        root = TreeNode.insert(root, 40);
        root = TreeNode.insert(root, 50);
        root = TreeNode.insert(root, 25);
        System.out.println("Inorder traversal of the given tree");
        inorder(root);
        System.out.println();
        System.out.println("Preorder traversal of the given tree");
        preorder(root);
        System.out.println();
        System.out.println("Postorder traversal of the given tree");
        postorder(root);
        System.out.println();
        System.out.println("Levelorder traversal of the given tree");
        levelorder(root);
    }
}
