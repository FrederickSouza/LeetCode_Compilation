class Solution {
    public int numIslands(char[][] grid) {
        int ans = 0;
		
		for(int i = 0; i<grid.length; i++) {
			for(int j = 0; j<grid[0].length; j++) {
				if(grid[i][j] == '1') {
					ans++;
					clearLand(grid, i, j);
				}
			}
		}

		
		return ans;
	}
	
	public static void clearLand(char[][] grid, int i, int j) {
		if(i<0 || i>= grid.length || j<0 || j>=grid[i].length || grid[i][j] == '0') return;
		
		grid[i][j] = '0';
		clearLand(grid, i-1, j);
		clearLand(grid, i, j-1);
		clearLand(grid, i+1, j);
		clearLand(grid, i, j+1);
		
		
	}
}