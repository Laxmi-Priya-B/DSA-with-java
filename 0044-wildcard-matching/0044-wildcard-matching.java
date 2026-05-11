class Solution {
    public boolean isMatch(String s, String p) {
        int si=0;
        int pi=0;
        int match = 0;
        int star = -1;
        while(si < s.length()){
            if(pi < p.length() && (p.charAt(pi) == '?' || p.charAt(pi) == s.charAt(si))){
                si++;
                pi++;
            }
            else if(pi < p.length() && p.charAt(pi) == '*'){
                star = pi;
                match = si;
                pi++;
            }
            else if(star != -1){
                pi = star+1;
                match++;
                si=match;
            }
            else{
                return false;
            }
        }
        while(pi < p.length() && p.charAt(pi) == '*'){
            pi++;
        }
        if(pi != p.length()){
            return false;
        }
        return true;
    }
}