class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap();
		
		for(char c : s.toCharArray()) {
			if(map.get(c) == null) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}
		
		for(char c : t.toCharArray()) {
			if(map.get(c) == null) {
				return c;
			} else {
				map.put(c, map.get(c) -1);
			}
			
		}
		
		for(char c : map.keySet()) {
			if (map.get(c) == -1) {
				return c;
			}
		}
		
		
		return '-';
    }
}