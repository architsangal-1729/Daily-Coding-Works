import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] reverse(int[]arr){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            //swap(arr[s],arr[e]);
            s++;e--;
        }
        return arr;
    }
	public static int[] findArraySum(int[] a, int n, int[] b, int m) {
		// Write your code here.
        int i = n-1;
        int j = m-1;
        ArrayList<Integer> tempList = new ArrayList<>();
        int carry=0;
        while(i>=0&&j>=0){
            int sum = a[i]+b[j]+carry;
            carry = sum/10;
            sum = sum%10;
            tempList.add(sum);
            i--;j--;
        }
    //first case
        while(i>=0){
            int sum = a[i] + carry;
            carry = sum/10;
            sum = sum%10;
            tempList.add(sum);
            i--;
        }
    //second case
        while(j>=0){
            int sum = b[j] + carry;
            carry = sum/10;
            sum = sum%10;
            tempList.add(sum);
            j--;
        }
    //third case
        while(carry!=0){
            int sum = carry;
            carry = sum/10;
            sum = sum%10;
            tempList.add(sum);
        }
    //convert list into array
        int[] ansArr = new int[tempList.size()];
        for(int k=0;k<tempList.size();k++){
            ansArr[k]=tempList.get(k);
        }
    //returning reversed array because we are traversing given arrays frm back side and storing the answer frontwise 
        return reverse(ansArr);
	}
}
