class Solution {
    public int maxIceCream(int[] costs, int coins) {
		Arrays.sort(costs);
		
		int maxIC = 0;
		int n = costs.length;
		while(maxIC < n && coins>=costs[maxIC]) {
			coins -= costs[maxIC];
			maxIC++;
		}
		
		return maxIC;
    }
}