class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        int m = s2.length();
        if(m<k) return false;
        int[] res1 = new int[26];
        int[] res2 = new int[26];
        int index = 0;
        for(int i = 0; i<k; i++){
            res1[s1.charAt(i)-'a']++;
            res2[s2.charAt(i)-'a']++;
        }
        if(isMatched(res1, res2)){
            return true;
        }
        for(int i = 1; i< m-k+1; i++){
            res2[s2.charAt(i-1)-'a']--;
            res2[s2.charAt(i+k-1)-'a']++;

            if(isMatched(res1, res2)){
                return true;
            }
        }
        return false;
    }

    private boolean isMatched(int[] res1, int[] res2){
        for(int i = 0; i< 26; i++){
            if(res1[i] != res2[i]) return false;
        }
        return true;
    }
}
