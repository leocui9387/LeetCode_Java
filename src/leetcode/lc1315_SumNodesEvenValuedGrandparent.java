package leetcode;

import java.util.*;
import PreDefined.TreeNode;

public class lc1315_SumNodesEvenValuedGrandparent {
	public static void runner() {
		
		TreeNode root = new TreeNode(6);
        root.left = new TreeNode(7);
        root.right = new TreeNode(8);
        
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);
        
        root.left.left.left = new TreeNode(9);
        root.left.right.left = new TreeNode(1);
        root.left.right.right = new TreeNode(4);
        
        
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(3);
        
        root.right.right.right = new TreeNode(5);
        
        
        System.out.println(SumEvenGrandparent(root));
		
	}
	
	static public int SumEvenGrandparent(TreeNode root) {
        
		List<TreeNode> parent;
		List<TreeNode> child = new ArrayList<TreeNode>();
		List<TreeNode> evens = new ArrayList<TreeNode>();
		
		child.add(root);
		// BFS find all even nodes
		while(child.size() > 0) {
			parent = child;
			child = new ArrayList<TreeNode>();
			
			for(TreeNode n: parent) {
				if(n.left != null) {
					child.add(n.left);
				}
				if(n.right != null) {
					child.add(n.right);
				}
				
				if (n.val % 2 == 0) {
					evens.add(n);
				}
			}
			
		}
		
		// get to grand child node
		child = evens;
		for(int i = 0; i<2; i++) {
			parent = child;
			child = new ArrayList<TreeNode>();
			
			for(TreeNode n: parent) {
				if(n.left != null) {
					child.add(n.left);
				}
				if(n.right != null) {
					child.add(n.right);
				}
				
				if (n.val % 2 == 0) {
					evens.add(n);
				}
			}
			
			
		}
		
		int out = 0;
		for(TreeNode n : child) {
			out += n.val;			
		}
		
		return out;
    }
	
	
	
	
}

