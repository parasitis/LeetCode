class Solution 
{
    public int[] plusOne(int[] digits) 
    {
        int index=digits.length-1;
        while(index>=0)
        {
            if(digits[index]==9)
            digits[index]=0;
            
            else
            {
                digits[index]+=1;
                return digits;
            }
            index--;
        }
        int[] neww= new int[digits.length+1];
        neww[0]=1;
        return neww;
    }
}