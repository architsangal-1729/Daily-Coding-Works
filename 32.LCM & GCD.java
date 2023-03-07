class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        Long [] ans = new Long[2];
        Long a=A,b=B;
        while(a%b!=0){
            Long temp = a%b;
            a=b;
            b=temp;
        }
        ans[1]=b;
        ans[0]=(A*B)/ans[1];
        return ans;
    }
};
