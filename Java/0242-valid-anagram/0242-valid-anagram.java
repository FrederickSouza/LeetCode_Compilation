class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
		
		for(char c : s.toCharArray()) {
			if(c != ' ') {
				alphabet[c - 'a']++;
			}
		}
		
		for(char c : t.toCharArray()) {
			if(c != ' ') {
				alphabet[c - 'a']--;
			}
		}
		
		
		for(int i : alphabet) {
			if(i != 0) return false;
		}
		
		return true;
    }
}