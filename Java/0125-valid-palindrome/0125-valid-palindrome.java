class Solution {
    public boolean isPalindrome(String s) {
        Stack<Integer> pilhaA = new Stack();
		Stack<Integer> pilhaB = new Stack();
        
		
		for(char c : s.toCharArray()) {
			if(c >= 48 && c <= 57) {
				//num
				pilhaA.add((int)c);
			} else if (c >= 65 && c <= 90) {
				//A-Z
				pilhaA.add((int)c - 65);
			} else if (c >= 97 && c<= 122) {
				//a-z
				pilhaA.add((int)c - 97);
			}
		}
		
		int size = pilhaA.size();
		for(int i = 0; i< size/2; i++) {
			pilhaB.push(pilhaA.pop());
		}
        
		if(pilhaA.size() != pilhaB.size()) {
			pilhaA.pop();
		}
		
		while(!pilhaA.empty()) {
			if(pilhaA.pop() != pilhaB.pop()) {
				return false;
			}
		}
		
		return true;
    }
}