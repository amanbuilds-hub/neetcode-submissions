class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i<str.length(); i++){
            if(Character.isLetterOrDigit(str.charAt(i))){
                sb.append(str.charAt(i));
            }
        }
        int n = sb.length();
        for(int i =0;i< n/2; i++){
            
            if(sb.charAt(i) != sb.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}
