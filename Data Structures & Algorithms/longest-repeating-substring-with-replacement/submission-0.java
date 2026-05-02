class Solution {
    public int characterReplacement(String s, int k) {
        int[] fre = new int[26];
        int maxLen = 0;
        int left = 0;
        int maxFreq = 0;
        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            fre[ch-'A']++;
            maxFreq = Math.max(maxFreq, fre[ch-'A']);

            if((right -left + 1) - maxFreq > k){
                fre[s.charAt(left)-'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;

    }
}
