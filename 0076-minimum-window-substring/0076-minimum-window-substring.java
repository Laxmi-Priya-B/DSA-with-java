class Solution {
    public String minWindow(String s, String t) {
        String res="";
        if (s == null || t == null || s.length() < t.length()) {
            return res;
        }
        int[] freq = new int[128];
        for (char c : t.toCharArray()) {
            freq[c]++;
        }
        int left = 0;
        int count = t.length();
        int min = Integer.MAX_VALUE;
        int start = 0;
        for (int right = 0; right < s.length(); right++) {
            if (freq[s.charAt(right)] > 0) {
                count--;
            }

            freq[s.charAt(right)]--;
            while (count == 0) {
                if (right - left + 1 < min) {
                    min = right - left + 1;
                    start = left;
                }
                freq[s.charAt(left)]++;
                if (freq[s.charAt(left)] > 0) {
                    count++;
                }

                left++;
            }
        }
        if(min == Integer.MAX_VALUE){
            return res;
        }
        else{
            res = s.substring(start, start + min);
        }
        return res;
    }
}