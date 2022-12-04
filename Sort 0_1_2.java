public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int count0=0,count1=0,count2=0;
        //Set<Integer> s = HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) count0++;
            else if(arr[i]==1) count1++;
            else if(arr[i]==2) count2++;
        }
        for(int j=0;j<count0;j++){
            arr[j]=0;
        }
        for(int j=count0;j<count0+count1;j++){
            arr[j]=1;
        }
        for(int j=count0+count1;j<count0+count1+count2;j++){
            arr[j]=2;
        }
    }
}
