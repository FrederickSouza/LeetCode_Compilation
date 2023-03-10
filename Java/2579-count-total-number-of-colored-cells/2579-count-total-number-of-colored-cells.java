class Solution {
    public long coloredCells(int n) {
		
		long ans = 1;
		
		for(int i = 0; i<n-1; i++) {
			ans += 4 + i*4;
		}
		
		return ans;
    }
}