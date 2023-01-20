class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
    	ArrayList<Integer> ans = new ArrayList();
        
        for(int i: nums1) {
        	if(hm.containsKey(i)) {
        		hm.put(i, hm.get(i) + 1);
        	} else {
        		hm.put(i, 1);
        	}
        }
    	
        for(int j: nums2) {
        	if(hm.containsKey(j) && hm.get(j) > 0) {
        		hm.put(j, hm.get(j) - 1);
        		ans.add(j);
        	}
        }
        
        int[] temp = new int[ans.size()];
        
        for(int k=0; k<temp.length; k++) {
        	temp[k] = ans.get(k);
        }
        
    	return temp;
    }
}