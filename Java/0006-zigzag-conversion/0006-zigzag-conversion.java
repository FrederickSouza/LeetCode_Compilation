class Solution {
    public String convert(String s, int numRows) {
		if(numRows == 1) { return s;}

    	Map<Integer, StringBuilder> mapa = new HashMap<>();
		int j = 0;
		boolean down = true;
		
		for(char c : s.toCharArray()) {
			
    		mapa.put(j, mapa.getOrDefault(j, new StringBuilder()).append(c));
    		
    		if(j==numRows-1) {
    			down = false;
    		} else if (j==0) {
    			down = true;
    		}

    		if(down) {
    			j++;
    		} else {
    			j--;
    		}
    	}
    	
		StringBuilder ans = new StringBuilder();
    	for(int i = 0; i<numRows; i++) {
    		ans.append( mapa.getOrDefault(i, new StringBuilder()) );
    	}
    	
    	return ans.toString();
    }
}