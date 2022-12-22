import java.util.ArrayList;

public class Solution {

	public static int findDuplicate(ArrayList<Integer> arr) {
        int ans =0;
        for(int i=0;i<arr.size();i++){
            ans = ans^arr.get(i);
        }
        for (int j=1;j<arr.size();j++){
            ans = ans^j;
        }
        return ans;
	}
}
