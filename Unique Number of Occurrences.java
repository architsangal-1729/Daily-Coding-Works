import java.util.HashMap;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
      
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
      
        HashSet<Integer> set = new HashSet<>();
		    for (int j : map.keySet()) {
			      if (set.contains(map.get(j))){
                return false;
            }
            set.add(map.get(j));	
		    }
      
        return true;
    }
}
