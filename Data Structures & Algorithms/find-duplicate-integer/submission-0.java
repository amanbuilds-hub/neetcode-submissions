class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int res = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int value = entry.getValue();
            if(value > 1){
                res = entry.getKey();
            }
        }
        return res;
    }
}
