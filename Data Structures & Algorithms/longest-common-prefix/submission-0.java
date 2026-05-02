class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder("");
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int lenf = first.length();
        int lenl = last.length();
        if(lenf > lenl){
            for(int i = 0; i< lenl; i++){
                if(first.charAt(i) != last.charAt(i)){
                    break;
                }else{
                    str.append(first.charAt(i));
                }
            }
        }else{
            for(int i = 0; i< lenf; i++){
                if(first.charAt(i) != last.charAt(i)){
                    break;
                }else{
                    str.append(first.charAt(i));
                }
            }
        }
        return str.toString();
    }
}