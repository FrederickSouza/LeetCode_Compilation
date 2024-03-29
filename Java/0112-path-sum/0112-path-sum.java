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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return somarCaminho(root, targetSum, 0);
	}
	
	public static boolean somarCaminho(TreeNode root, int targetSum, int currSum) {
		
		if(root != null) {
			currSum += root.val;
		} else {
            return false;
        }
		
		if(root.left == null && root.right == null) {
			if(targetSum == currSum) {
				return true;
			}
			else {
				return false;
			}
		}
	
		boolean left = somarCaminho(root.left, targetSum, currSum);
		boolean right = somarCaminho(root.right, targetSum, currSum);
		
		
		return left || right;
    }
}