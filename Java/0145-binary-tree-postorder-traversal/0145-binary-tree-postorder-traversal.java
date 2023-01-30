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
    public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList();
		visitar(root, ans);
		return ans;
	}
	
	public static void visitar(TreeNode root, List<Integer> ans) {
		if(root != null) {
			visitar(root.left, ans);
			visitar(root.right, ans);
			ans.add(root.val);
		}
	}
}