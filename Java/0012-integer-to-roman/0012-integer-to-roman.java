class Solution {
    public String intToRoman(int num) {
        	
		StringBuilder ans = new StringBuilder();

		while(num != 0) {
			if(num - 1000 >= 0) {
				ans.append('M');
				num -= 1000;
			}else if(num - 900 >= 0) {
				ans.append("CM");
				num -= 900;
			}else if(num - 500 >= 0) {
				ans.append('D');
				num -= 500;
			}else if(num - 400 >= 0) {
				ans.append("CD");
				num -= 400;
			}else if(num - 100 >= 0) {
				ans.append('C');
				num -= 100;
			}else if(num - 90 >= 0) {
				ans.append("XC");
				num -= 90;
			}else if(num - 50 >= 0) {
				ans.append('L');
				num -= 50;
			}else if(num - 40 >= 0) {
				ans.append("XL");
				num -= 40;
			}else if(num - 10 >= 0) {
				ans.append('X');
				num -= 10;
			}else if(num - 9 >= 0) {
				ans.append("IX");
				num -= 9;
			}else if(num - 5 >= 0) {
				ans.append('V');
				num -= 5;
			}else if(num - 4 >= 0) {
				ans.append("IV");
				num -= 4;
			}else if(num - 1 >= 0) {
				ans.append('I');
				num -= 1;
			}
		}
		
		
		return ans.toString();
    }
}