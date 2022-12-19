

public class RemoveElement {
	public static void solution() {
		int[] arr = {0,1,1,2,3,4,4,1,4,5,9,1,1}; 
		int val = 1; //value to remove
		
		int k = removeElement(arr, val);
		
		for(int i=0; i<k; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int removeElement(int[] nums, int val) {
		int k=0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] != val) {
				nums[k] = nums[i];
				k++;
			}
		}
		
		System.out.println("k: " + k);
		return k;
	}
	
}
