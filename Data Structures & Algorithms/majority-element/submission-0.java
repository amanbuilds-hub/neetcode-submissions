

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        int majority = 0;
        int nu = nums.length / 2;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int value = entry.getValue();
            if(value > nu){
                majority = entry.getKey();
            }
        }
        return majority;
    }
}