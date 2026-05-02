class Solution {
    public int[] sortArray(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int num : nums){
            arr.add(num);
        }
        int n = arr.size()-1;
        while(n >= 0){
            int min = Integer.MAX_VALUE;
            for(int i = 0; i<arr.size(); i++){
                min = Math.min(min, arr.get(i));
            }
            arr.remove(Integer.valueOf(min));
            nums[n] = min;
            
            n--;
        }
        
        for(int i = 0; i< nums.length/2; i++){
            int temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;
        }
        return nums;
    }
}