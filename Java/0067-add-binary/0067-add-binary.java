class Solution {
    public String addBinary(String a, String b) {
        int lenA = a.length()-1;
		int lenB = b.length()-1;
		int temp = 0;
		
		StringBuilder sum = new StringBuilder();
		
		while(lenA>=0 || lenB>=0) {
			if(lenA>=0) {
				temp += a.charAt(lenA) == '1' ? 1 : 0;
				lenA--;
			}
			if(lenB>=0) {
				temp += b.charAt(lenB) == '1' ? 1 : 0;
				lenB--;
			}
			sum.append(temp%2);
			temp = temp > 1 ? 1 : 0;
		}
		if (temp>0) sum.append(1);
		return sum.reverse().toString();
    }
}