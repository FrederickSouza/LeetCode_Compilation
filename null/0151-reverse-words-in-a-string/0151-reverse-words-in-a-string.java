class Solution {
    public String reverseWords(String s) {
        String ans = "";
		String word = "";
		int aux = 0;
		
		for(int i = s.length()-1; i>=0; i--) {
			if(s.charAt(i) == ' ') {
				aux++;
			} else {
				word = s.charAt(i) +  word;
				aux = 0;
			}
			
			if(aux == 1 || i == 0) {
				ans = ans + " " + word;
				word = "";
			}
			
		}
		
		
		return ans.trim();
    }
}