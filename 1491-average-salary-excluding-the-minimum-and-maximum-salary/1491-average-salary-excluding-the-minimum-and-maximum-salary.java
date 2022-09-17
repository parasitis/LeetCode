class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int high=salary.length;
        double sum=0;
        for(int i=1;i<high-1;i++)
        {
           sum+=salary[i];
        }
        double avg= sum/(salary.length-2);
        
        return avg;
    }
}