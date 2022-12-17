class Solution {
    public int removeDuplicates(int[] nums) {
		
        /*
		if(null == nums || nums.length == 0) {
			return 0;
		}
		*/
		int k = 0;
		
		for(int i=0; i<nums.length; i++) {
			//System.out.print(nums[i] + " ");
			if(nums[k] != nums[i]) {
				nums[k+1] = nums[i];
				k++;
			}
		}
		
		//System.out.println();
		return k+1;
    }
}