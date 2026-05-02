class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int n = nums.length;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int value = entry.getValue();
            if(value > (n/3)){
                l.add(entry.getKey());
            }
        }
        return l;
    }
}