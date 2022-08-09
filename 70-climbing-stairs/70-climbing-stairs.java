class Solution {
    public int climbStairs(int n) {
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        int a=1;
        int b=2;
        int t,i=3;
        while(i<=n)
        {
            t=b;
            b=a+b;
            a=t;
            i++;
        }
        return b;
        
    }
}