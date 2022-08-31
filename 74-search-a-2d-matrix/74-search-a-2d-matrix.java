class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length-1;
        int n=matrix[0].length;
        
        int c=0;
        while(m>=0 && c<n)
        {
            if(matrix[m][c]==target)
                return true;
            
            if(matrix[m][c]>target)
                m--;
            
            else
                c++;
        }
        return false;
    }
}