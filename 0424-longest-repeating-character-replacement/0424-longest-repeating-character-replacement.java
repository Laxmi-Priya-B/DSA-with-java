class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int max =0;
        int l=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            int idx = s.charAt(i) - 'A';
            freq[idx]++;
            max = Math.max(max,freq[idx]);
            while((i - l + 1) - max > k){
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            res = Math.max(res, i - l + 1);
        }
        return res;
    }
}