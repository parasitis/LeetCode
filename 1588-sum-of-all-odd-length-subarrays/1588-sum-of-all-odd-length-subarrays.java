class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int result=0;
        for(int i=0;i<arr.length;i++)
        {
            int before=i-0;
            int after=arr.length-i;
            int beforeeven= before/2;
            int beforeodd=(before+1)/2;
            int aftereven= after/2;
            int afterodd=(after+1)/2;
            int totalcount=afterodd +(beforeodd*aftereven)+(beforeeven*afterodd);
            result+=arr[i]*totalcount;
        }
        return result;
        
    }
}