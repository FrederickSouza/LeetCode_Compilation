class Solution {
    public char findTheDifference(String s, String t) {

		char ans = 0;
		for(char cs: s.toCharArray()) {
			ans ^= cs;
		}
		for(char ct: t.toCharArray()) {
			ans ^= ct;
		}
        
		return ans;
    }
}