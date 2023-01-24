class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap map = new LinkedHashMap();
    	char[] sequence = s.toCharArray();
    	
    	for(int i=0; i<sequence.length; i++) {
    		if(map.containsKey(sequence[i])) {
    			map.put(sequence[i], -1);
    		} else {
    			map.put(sequence[i], i);
    		}
    	}
  
    	for(Object c : map.entrySet()) {
    		if(!c.toString().contains("=-1")) {
    			String index = c.toString().split("=")[1];
    			int i = Integer.parseInt(index);
    			return i;
    		}
    	}
    	
    	return -1;
    }
}