class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=0;i<nums1.length;i++)
        {
            int var=nums1[i];
            int temp=-1;
            for(int j=nums2.length-1;j>=0;j--)
            {
                if(nums2[j]>var)
                    temp=nums2[j];
                else if(nums2[j]==var){
                    nums1[i]=temp;
                    break;
                }
            }
        }
        return nums1;
    }
}