class Solution {
    public boolean isValid(String s) {
		char bar;
		Stack<Character> pilha = new Stack<Character>();
		
		for(int i=0; i<s.length(); i++) {
			bar = s.charAt(i);
			if (bar == '(') {
				pilha.push(')');
			} else if (bar == '[') {
				pilha.push(']');
			} else if (bar == '{') {
				pilha.push('}');
			} else if (pilha.isEmpty() || pilha.pop() != bar) {
				return false;
			}
		}
		return pilha.isEmpty();
    }
}