class Solution {
    public boolean isMatch(String s, String p) {
        return helper(s,p,0,0);
    }
    boolean helper(String s, String p, int s_idx, int p_idx){
        if (p_idx == p.length()) {
            return s_idx == s.length();
        }
        boolean match = (s_idx < s.length() && (s.charAt(s_idx) == p.charAt(p_idx) || p.charAt(p_idx) == '.'));
        
        if(p_idx+1 < p.length() && p.charAt(p_idx+1) == '*'){
            return helper(s,p,s_idx,p_idx+2) || (match && helper(s,p,s_idx+1,p_idx));
        }
        return match && helper(s,p,s_idx+1,p_idx+1);
    }
}