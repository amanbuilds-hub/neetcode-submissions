class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int count = 0;
        int i =0;
        for(int num : set){
            nums[i++] = num;
            
        }
        return i;
    }
}