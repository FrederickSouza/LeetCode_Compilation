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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        	
		TreeNode ans = root;
		TreeNode insert = new TreeNode(val);
		TreeNode temp = null;
		
		while(root != null) {
			temp = root;
			root = root.val < val ? root.right : root.left;
		}
		
		if (temp == null) {
			return insert;
		}
		
		if(temp.val < val) {
			temp.right = insert;
		} else {
			temp.left = insert;
		}
		
		
		return ans;
    }
}