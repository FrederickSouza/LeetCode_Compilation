class Solution {
    public boolean isPerfectSquare(int num) {
        		
		if(num == 1) return true;
		
		long i = 2;
		long j = num/2;
		
		while(i<=j) {
			long mid = i + (j-i)/2;
			
			if(mid * mid == num) {
				return true;
			} else if (mid * mid < num) {
				i = mid + 1;
			} else {
				j = mid - 1;
			}
		}
		return false;
    }
}