//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        // TC: O(nlog n)
        // SC: O(n) since we are storing all the summations.
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int maxi=0;
         for(int i=0;i<n;i++){
             sum += arr[i];
             if(sum==0){
                 maxi = i+1;    //if the subarray simply gives the sum==0
             }
             else{
                 if(map.containsKey(sum)){
                     maxi = Math.max(maxi,i-map.get(sum));  //"i" points at the idx where the new sum repeats & map.get(sum) gives the idx frm the map at what idx that sum was previously seen
                 }
                 else{
                     map.put(sum,i);
                 }
             }
         }
         return maxi;
    }
}               
