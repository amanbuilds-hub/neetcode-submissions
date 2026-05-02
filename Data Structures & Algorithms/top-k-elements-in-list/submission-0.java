class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        while(k >0){
            int max = Integer.MIN_VALUE;
            int topKey = 0;
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getValue() > max){
                    max = entry.getValue();
                    topKey = entry.getKey();

                }
            }
            res[k-1] = topKey;
            k--;
            map.remove(topKey);
        }
        return res;
    }
}
