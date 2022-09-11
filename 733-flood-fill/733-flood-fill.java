class Solution {
    final int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int temp= image[sr][sc];
        if(temp==color)
            return image;
        dfs(sr,sc,color,temp,image);
        return image;
    }
    
    public void dfs(int sr, int sc,int color, int temp, int[][] image)
    {
        image[sr][sc] =color;
        for(int[] d: dir)
        {
            int r=sr+d[0];
            int c=sc+d[1];
            if(r>=0 && r<image.length && c>=0 && c<image[0].length && image[r][c]==temp)
            {
                dfs(r,c,color,temp,image);
            }
        }
            
    }
}

