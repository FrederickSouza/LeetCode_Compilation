class Solution {
    public long findTheArrayConcVal(int[] nums) {
      	long ans = 0;
		
		int i = 0;
		int j = nums.length -1;
		
		while (i<j) {
			
			String concat = String.valueOf(nums[i]) + String.valueOf(nums[j]);
			
			ans += Long.parseLong(concat);
			
			i++;
			j--;
		}
		
		if(i==j) {
			ans += nums[i];
		}
		
		
		return ans;  
    }
}