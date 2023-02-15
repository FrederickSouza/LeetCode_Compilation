class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    	Set<Integer> numeros = new HashSet<>();
		Set<Integer> ans = new HashSet<>();
		
		for(int i : nums1) {
			numeros.add(i);
		}
		
		for(int j : nums2) {
			if(numeros.contains(j) == true) {
				ans.add(j);
			}
		}
		
		int[] resposta = new int[ans.size()];
		int x = 0;
		for(int z : ans) {
			resposta[x] = z;
			x++;
		}
		
		
		return resposta;
    }
}