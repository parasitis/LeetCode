class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length-1;
        int l=0;
        int h=n;
      //  int mid;
        
       for(int i=0;i<=nums.length-1;i++)
      // while(l<=h)
        {
            int mid=(l+h)/2;
          if(target==nums[mid])
              return mid;
            if(target>nums[mid])
            {
                l=mid+1;
            }
            else 
                h=mid-1;
        }
            return -1;
    }
}