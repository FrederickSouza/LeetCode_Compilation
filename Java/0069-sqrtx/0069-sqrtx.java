class Solution {
    public int mySqrt(int x) {
        int temp = 1;
		int sqrt = 0;
		
		while(x>=temp) {
			x -= temp;
			temp += 2;
			sqrt++;
		}
		
		return sqrt;
    }
}