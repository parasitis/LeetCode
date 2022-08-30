/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
public int firstBadVersion(int n) {
int lowerBound = 1;
int upperBound = n;
while(lowerBound <= upperBound){
int mid = lowerBound + (upperBound - lowerBound) / 2;
boolean ans = isBadVersion(mid);
if(ans == true) upperBound = mid - 1;
else lowerBound = mid + 1;
}
return lowerBound;
}
}