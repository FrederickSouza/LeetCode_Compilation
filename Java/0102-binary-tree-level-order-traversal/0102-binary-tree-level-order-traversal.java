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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList();
		Queue<TreeNode> fila = new LinkedList();
		
		fila.add(root);
		
		while(!fila.isEmpty()) {
			List<Integer> level = new ArrayList();
			
			int size = fila.size();
			
			for(int i=0; i<size; i++) {
				TreeNode curr = fila.poll();
				if(curr != null) {
					level.add(curr.val);
					fila.add(curr.left);
					fila.add(curr.right);
				}
			}
			if(!level.isEmpty()) {
				ans.add(level);
			}
		}
		
		return ans;
    }
}