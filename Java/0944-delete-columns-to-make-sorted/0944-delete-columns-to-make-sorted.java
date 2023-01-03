class Solution {
    public int minDeletionSize(String[] strs) {
        int tmp;
    	int columns = 0;
        
    	for(int j = 0; j<strs[0].length(); j++) {
        	tmp = 0;
        	for(int i = 0; i<strs.length; i++){
    			if(tmp > (int) strs[i].charAt(j)) {
    				columns ++;
    				break;
    			}
        		tmp = strs[i].charAt(j);
    		}
    	}
    	
    	return columns;
    }
}