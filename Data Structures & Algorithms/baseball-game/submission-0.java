class Solution {
    public int calPoints(String[] operations) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i<operations.length; i++){
            String op = operations[i];
            if(op.equals("+")){
                int res = arr.get(arr.size()-1)+arr.get(arr.size()-2);
                arr.add(res);
            }else if(op.equals("D")){
                int val = 2*arr.get(arr.size()-1);
                arr.add(val);
            }else if(op.equals("C")){
                arr.remove(arr.size()-1);
            }else{
                int num = Integer.parseInt(op);
                arr.add(num);
            }
        }
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        return sum;
    }
}