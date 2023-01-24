class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
		if(ransomNote.length() > magazine.length()) {
			return false;
		}
		
		int[] alphabet_counter = new int[26];
		
		for(Character c : magazine.toCharArray()) {
			alphabet_counter[c - 'a']++;
		}
		
		for(Character c : ransomNote.toCharArray()) {
			if(alphabet_counter[c - 'a'] == 0 ) {
				return false;
			}
			alphabet_counter[c - 'a']--;
		}
		
		return true;
    }
}