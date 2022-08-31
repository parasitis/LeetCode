class Solution {
    public int arrangeCoins(int n) {
        if(n==1){
            return 1;
        }
        else
        {
            int rowcoins=1;
            while(n-rowcoins>=0)
            {
                n=n-rowcoins;
                rowcoins++;
            }
            return rowcoins-1;
        }
    }
}