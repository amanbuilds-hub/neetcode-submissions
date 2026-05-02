class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int idx = 0;
        
        while(idx != nums.length){
            int mul = 1;
            for(int i = 0; i< nums.length; i++){
                if(idx == i) continue;
                else{
                    mul *= nums[i];
                }
            }
            res[idx] = mul;
            idx++;
        }
        return res;
    }
}  
