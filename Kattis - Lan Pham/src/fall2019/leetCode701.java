package fall2019;

public class leetCode701 {
	
	public TreeNode insertIntoBST(TreeNode root, int val) {
        
		return helper(root, val, root);
    }
	
	public TreeNode helper(TreeNode root, int val, TreeNode ret) {
		TreeNode omg = new TreeNode(val);
		
		if (root.right == null && val > root.val) {
			root.right = omg;
			return ret;
		}
		if (root.left == null && val < root.val) {
			root.left = omg;
			return ret;
		}
		else {
			if (val > root.val) {
				return helper(root.right, val, ret);
			}
			else {
				return helper(root.left, val, ret);
			}
		}
	
	}

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

}
