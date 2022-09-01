class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        for(int num: nums2)
            list1.add(num);
        
        for(int i=0;i<nums1.length;i++){
            if(list1.contains(nums1[i])){
                int index = list1.indexOf(nums1[i]);
                list1.remove(index);
                list2.add(nums1[i]);
            }
        }
        
        int arr[] = new int[list2.size()];
        for(int k=0;k<list2.size();k++)
            arr[k]=list2.get(k);
        return arr;
    }
}