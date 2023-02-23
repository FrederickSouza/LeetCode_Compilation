class Solution {
    public String getHint(String secret, String guess) {
        	 
		Map<Character, Integer> mapa = new HashMap<>();
		int x = 0;
		int y = 0;
		int[] index = new int[secret.length()];
		
		
		for(int i = 0; i<secret.length(); i++) {
			
			if(secret.charAt(i) == guess.charAt(i)) {
				x++;
				index[i] = 1;
			} else {
				mapa.put(secret.charAt(i), mapa.getOrDefault(secret.charAt(i), 0) + 1);
			}
			
		}
		
		for(int j = 0; j<guess.length(); j++) {
			char temp = guess.charAt(j);
			if(index[j] != 1 && mapa.getOrDefault(temp, 0) >0) {
				y++;
				mapa.put(temp , mapa.get(temp) -1);
			}
		}
		
		
		return new String(x + "A" + y + "B");
    }
}