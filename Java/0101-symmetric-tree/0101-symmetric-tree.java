/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
		boolean ans = traverse(root,root);
		return ans;
	}
	
	public static boolean traverse(TreeNode nodeA, TreeNode nodeB) {
		if(nodeA == null && nodeB == null) {
			return true;
		} else if (nodeA == null || nodeB == null) {
			return false;
		} else if (nodeA.val != nodeB.val) {
			return false;
		}
		
		boolean left = traverse(nodeA.left, nodeB.right);
		if(!left) {
			return false;
		}
		
		boolean right = traverse(nodeA.right, nodeB.left); 
		if(!right) {
			return false;
		}
		
		return left && right;
    }
}