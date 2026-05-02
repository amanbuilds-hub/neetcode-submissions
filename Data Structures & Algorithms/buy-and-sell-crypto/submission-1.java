class Solution {
    public int maxProfit(int[] nums) {
        int max = 0;
        for(int i = 0; i< nums.length-1; i++){
            for(int j = i+1; j< nums.length; j++){
                if(nums[i] > nums[j]) continue;
                else{
                    max = Math.max(max, nums[j]-nums[i]);
                }
            }
        }
        return max;
    }
}
