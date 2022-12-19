

public class RemoveDuplicatesFromSortedArray {

	public static void solution() {
		//int[] nums = {0,0,1,1,2,2,2,3,4,5,5,5};
		//int[] nums = {1,1,2};
		int[] nums = {};
		
		int k = removeDuplicate(nums);
		
		for(int i = 0; i<k; i++) {
			System.out.print(nums[i] + " ");
		}
	}
	
	public static int removeDuplicate(int[] nums) {
		
		if(null == nums || nums.length == 0) {
			return 0;
		}
		
		int k = 0;
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
			if(nums[k] != nums[i]) {
				nums[k+1] = nums[i];
				k++;
			}
		}
		
		System.out.println();
		return k+1;
	}
}
