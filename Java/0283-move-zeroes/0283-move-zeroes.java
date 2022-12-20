class Solution {
    public void moveZeroes(int[] nums) {
        int zeroes = 0;
		int k = 0;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == 0) {
				zeroes++;
			} else {
				nums[k] = nums[i];
				k++;
			}
		}
		
		for (int j = nums.length-1; j>= nums.length-zeroes; j--)
			nums[j]=0;
    }
}