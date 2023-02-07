class Solution {
    public int addDigits(int num) {
        		
		while(num > 9) {
			String temp = Integer.toString(num);

			num = 0;
			for(int i=0; i<temp.length(); i++) {
				num += (int) temp.charAt(i) - 48;
			}
		}
		
		return num;
    }
}