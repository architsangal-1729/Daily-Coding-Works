import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
public class Solution{
    public static int[][] pairSum(int[] arr, int s) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==s){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(Math.min(arr[i],arr[j]));
                    temp.add(Math.max(arr[i],arr[j]));
                    ans.add(temp);
                }
            }
        }
        int[][] result = new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            result[i][0]=ans.get(i).get(0);
            result[i][1]=ans.get(i).get(1);
        }
        return result;
    }
}
