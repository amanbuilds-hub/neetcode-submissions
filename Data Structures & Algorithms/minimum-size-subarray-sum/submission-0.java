class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // //Use sliding window
        // int left = 0;
        // int right = nums.length-1;
        
        if(nums[nums.length-1] >= target) return 1;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length-1; i++){
            int sum = nums[i];
            if(sum >= target) return 1;
            for(int j = i+1; j<nums.length; j++){
                sum += nums[j];
                if(sum >= target){
                    min = Math.min(min, j-i+1);
                }
            }
        }
        if(min == Integer.MAX_VALUE) return 0;
        else return min;
        
        
    }
}