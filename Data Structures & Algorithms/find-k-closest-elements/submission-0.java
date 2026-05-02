class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int[] nums = new int[arr.length];
        for(int i =0; i<arr.length; i++){
            nums[i] = Math.abs(x-arr[i]);
        }
        
        
        while(k != 0){
            int min = Integer.MAX_VALUE;
            int idx = 0;
            for(int i = 0; i< nums.length; i++){
                if(min > nums[i]){
                    min = nums[i];
                    idx = i;
                }
            }
            nums[idx] = Integer.MAX_VALUE;
            list.add(arr[idx]);
            k--;
        }
        Collections.sort(list);
        return list;
    }
}