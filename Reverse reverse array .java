import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        int s = m+1 , e = arr.size()-1;
        while(s<=e){
            int temp = arr.get(e);
            arr.set(e,arr.get(s));
            arr.set(s,temp);
            s++;
            e--;
        }
    }
}
