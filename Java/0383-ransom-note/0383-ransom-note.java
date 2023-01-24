class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap();
		
		for(int i=0; i<ransomNote.length(); i++) {
			char temp = ransomNote.charAt(i);
			
			if(map.get(temp) != null) {
				map.put(temp, map.get(temp) + 1);
			} else {
				map.put(temp, 1);
			}
		}
		
		//printMap(map);
		
		for(int j=0; j<magazine.length(); j++) {
			char letra = magazine.charAt(j);
			
			if(map.get(letra) != null && map.get(letra) > 0) {
				map.put(letra, map.get(letra) -1);
			}
		}

		Set<Integer> ans = new HashSet(map.values());
		if(ans.size() == 1 && ans.contains(0)) {
			return true;
		}
		
		return false;
    }
}