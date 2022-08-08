class Solution {
    public int mySqrt(int x) {
        long l=1 ; long h =x ; long ans=0;
        while(l<=h){
            long mid = l +(h-l)/2;
            if(mid*mid == x){return (int)mid;}
            if(mid*mid>x){h=mid-1;}
            else{
                l=mid+1;
                ans = mid;
            }
        }
        return (int)ans;
        
    }
}