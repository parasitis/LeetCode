class Solution {
public int[] searchRange(int[] nums, int target) {
int l=0;
int r=nums.length-1;
int[] res= new int[2];
Arrays.fill(res,-1);
int mid=0;

    if(nums.length==0)
        return res;
    
    while(r>l)
    {
        mid=(l+r)/2;
        if(nums[mid]<target)
            l=mid+1;
        else
            r=mid;
    }
    if(nums[l]!=target) return res;
    else res[0]=l;
    
    r=nums.length-1;
    while(r>l)
    {
        mid=(l+r)/2+1;
        if(nums[mid]>target)
            r=mid-1;
        else
            l=mid;
    }
    res[1]=r;
    
    return res;
        
        
}
}