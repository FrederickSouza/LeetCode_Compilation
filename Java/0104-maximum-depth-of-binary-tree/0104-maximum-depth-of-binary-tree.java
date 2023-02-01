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
    public int maxDepth(TreeNode root) {
        
		int ans = -1;
		Queue<TreeNode> fila = new LinkedList();
		fila.add(root);
		
		while(!fila.isEmpty()) {
			int tamanho = fila.size();
			
			for(int i=0; i<tamanho; i++) {
				TreeNode curr = fila.poll();
				if(curr != null) {
					fila.add(curr.left);
					fila.add(curr.right);
				}
			}
			ans++;
		}
		
		
		return ans;
    }
}