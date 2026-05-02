class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] arr = new int[len];
        arr[len-1] = 0;
        for(int i = 0; i<len-1; i++){
            for(int j = i+1;j <len; j++){
                if(temperatures[j]>temperatures[i]){
                    arr[i] = j-i;
                    break;
                }
            }
        }
        return arr;
    }
}
