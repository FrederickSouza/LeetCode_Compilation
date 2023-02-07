class Solution {
    public boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() -1;
		
		while(i<j) {
			char l = s.charAt(i);
			if(l >= 'A' && l <= 'Z') {
				l += 32;
			}
			if (!(l >= '0' && l<= '9') && !(l >= 'a' && l <= 'z')) {
				i++;
				continue;
			}
			
			
			char r = s.charAt(j);
			if(r >= 'A' && r <= 'Z') {
				r += 32;
			}
			if (!(r >= '0' && r<= '9') && !(r >= 'a' && r <= 'z')) {
				j--;
				continue;
			}
			
			if(r == l) {
				i++;
				j--;
			} else {
				return false;
			}	
		}
		
		
		return true;
    }
}