package fall2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leetCode1305 {
	
	
	public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
		
		ArrayList<Integer> tree1 = new ArrayList<Integer>();
		tree1 = helperMethod(root1, tree1);
		ArrayList<Integer> tree2 = new ArrayList<Integer>();
		tree2 = helperMethod(root2, tree2);
		
		tree1.addAll(tree2);
		Collections.sort(tree1);
		
		return tree1;
        
    }
	
	public ArrayList<Integer> helperMethod(TreeNode root, ArrayList<Integer> which) {
		if (root == null) {
			
		}
		else {
			helperMethod(root.left, which);
			which.add(root.val);
			helperMethod(root.right,which);
			
		}
		
		return which;
	}
	
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }

}
