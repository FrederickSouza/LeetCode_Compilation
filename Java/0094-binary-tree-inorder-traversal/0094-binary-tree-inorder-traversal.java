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
	public List<Integer> inorderTraversal(TreeNode root){
		List<Integer> resposta = new ArrayList();
		visitar(root, resposta);
		return resposta;
	}
	
	public static void visitar(TreeNode tn, List<Integer> resp) {
		if(tn !=null) {
			visitar(tn.left, resp);
			resp.add(tn.val);
			visitar(tn.right, resp);
		}
	}
}