class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
		if(mat.length * mat[0].length != r*c) {
			return mat;
		}
		
		int[][] ans = new int[r][c];
		int a = mat.length;
		int b = mat[0].length;
		
		for(int i=0; i<r*c; i++) {
			ans[i/c][i%c] = mat[i/b][i%b];
		}
		
		return ans;
    }
}