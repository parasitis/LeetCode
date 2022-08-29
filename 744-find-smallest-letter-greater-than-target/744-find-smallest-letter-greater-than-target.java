class Solution {
     
    public char nextGreatestLetter(char[] letters, char tar) {
        int n = letters.length;
        
        if((tar >= letters[n-1]) || (tar < letters[0])){
            return letters[0];
        }
        
        int beg = 0, end = n-1;
        
        while(beg <= end){
            int mid = (beg + end)/2;
            
            if(letters[mid] > tar){
                if(letters[mid-1] <= tar){
                    return letters[mid];
                }
                else{
                    end = mid-1;
                }
            }
            else{
                beg = mid+1;
            }
        }
        
        return letters[0];
    }
}