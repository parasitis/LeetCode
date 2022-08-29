class Solution 
{
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d)
    {
        Arrays.sort(arr2);
        int ans=0;
        for(int i=0;i<arr1.length;i++){
            int x=arr1[i];
            int l=0;
            int h=arr2.length-1;
            int xx=-1;
            boolean zz=true;
            while(true){
                int mid=(l+h)/2; 
                if(xx==mid) break;
                else if(Math.abs(x-arr2[mid])<=d){
                    zz=false;
                    break;
                }
                else if(x<arr2[mid]) h=mid-1;
                else if(x>arr2[mid]) l=mid+1;
                xx=mid;
            }
            if(zz)ans++;
        }
        return ans;
    }
}