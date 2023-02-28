class Solution {
    public int calculate(String s) {
        
		Stack<Integer> pilha = new Stack<>();
		s = s + "+";
		int num = 0;
		char sign = '+';
		
		for(char c : s.toCharArray()) {
			if(c-'0' >= 0 && c-'0' <=9) {
				num = num*10 + c - '0';
			}else {
				if(c == ' ') {
					continue;
				}
				
				switch (sign) {
				case '+':
					pilha.add(num);
					break;
				case '-':
					pilha.add(-num);
					break;
				case '*':
					pilha.add(pilha.pop() * num);
					break;
				case '/':
					pilha.add(pilha.pop() / num);
					break;
				}
				num = 0;
				sign = c;
			}
		}
		
		
		int ans = 0;
		for(int x : pilha) {
			ans += x;
		}
		
		return ans;
    }
}