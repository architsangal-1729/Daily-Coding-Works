import java.util.* ;
import java.io.*; 
public class Solution
{
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m){
        int i=0,j=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<n && j<m){
            if(arr1.get(i).equals(arr2.get(j))){
                ans.add(arr1.get(i));
                i++;j++;
            }
            else if(arr1.get(i)<arr2.get(j)){
                i++;
            }
            else {
                j++;   
            }   
        }
        return ans;
	}
}
