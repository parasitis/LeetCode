/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
public int firstBadVersion(int n) {
    int lb=1;
    int ub=n;
    while(lb<=ub)
    {
        int mid=lb+(ub-lb)/2;
        boolean ans =  isBadVersion(mid);
        if(ans==true)
            ub=mid-1;
        else
            lb=mid+1;
    }
    return lb;
    }
}