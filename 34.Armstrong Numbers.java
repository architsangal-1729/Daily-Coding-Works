class Solution {
    static String armstrongNumber(int n){
        int x=n;
        int temp=0;
        int ans=0;
        while(n!=0){
            temp=n%10;
            n=n/10;
            ans=ans+(int)Math.pow(temp,3);
        }
        if(ans==x) return "Yes";
        return "No";
    }
}
