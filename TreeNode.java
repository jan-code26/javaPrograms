//simple binary tree node
public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    //insert element in the simple binary tree
    public static TreeNode insert(TreeNode root, int data) {
        if(root == null) {
            return new TreeNode(data);
        }
        if(data <= root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }
}