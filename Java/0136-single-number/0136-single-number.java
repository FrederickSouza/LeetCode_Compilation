class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
		
        for(int x : nums) {
        	if(set.contains(x)) {
        		set.remove(x);
        	} else {
        		set.add(x);
        	}
        }
		
        int ans = (int) set.toArray()[0];
        
		return ans;
    }
}