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
        Queue<TreeNode> listaEsq = new LinkedList();
		Queue<TreeNode> listaDir = new LinkedList();
		
		listaEsq.add(root.left);
		listaDir.add(root.right);
		
		while(!listaEsq.isEmpty() && !listaDir.isEmpty()) {
			int sizeA = listaEsq.size();
			int sizeB = listaDir.size();
			
			if(sizeA != sizeB) {
				return false;
			}
			
			for(int i=0; i<sizeA; i++) {
				TreeNode nodeEsq = listaEsq.poll();
				TreeNode nodeDir = listaDir.poll();
				
				if(nodeEsq == null && nodeDir == null) {
					continue;
				} else if (nodeEsq == null || nodeDir == null) {
					return false;
				} else if (nodeEsq.val != nodeDir.val) {
					return false;
				}
				
				listaEsq.add(nodeEsq.left);
				listaEsq.add(nodeEsq.right);
				
				listaDir.add(nodeDir.right);
				listaDir.add(nodeDir.left);
				
			}
			
		}
		return true;
    }
}