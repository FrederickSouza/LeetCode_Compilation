class Solution {
    public int lengthOfLastWord(String s) {
         String sA = s.stripTrailing();
		 int lastIndex = sA.lastIndexOf(' ');
		 sA = sA.substring(lastIndex + 1);
		 char[] charSeq = sA.toCharArray();
		 
		 return charSeq.length;
    }
}