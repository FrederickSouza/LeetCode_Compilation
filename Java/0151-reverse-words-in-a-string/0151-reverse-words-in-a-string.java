class Solution {
    public String reverseWords(String s) {
		
		String[] strArr  = s.split(" ");
		String ans = "";
		
		for(int i = strArr.length-1; i>=0; i--) {
			if(strArr[i].trim() == "") {
				continue;
			}
			ans += " " + strArr[i];
			
		}
		
		
		return ans.substring(1);
    }
}