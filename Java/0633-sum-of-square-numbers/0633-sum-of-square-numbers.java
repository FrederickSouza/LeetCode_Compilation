class Solution {
    public boolean judgeSquareSum(int c) {
        long a = 0;
		long b = (long) Math.sqrt(c);
		
		while(a <= b) {
			long curr = a * a + b * b;
			
			if (curr < c) {
				a++;
			} else if (curr > c) {
				b--;
			} else {
				return true;
			}
		}
		
		return false;
    }
}