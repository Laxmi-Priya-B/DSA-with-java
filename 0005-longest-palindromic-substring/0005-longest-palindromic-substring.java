class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindrome(i,j,s)){
                    if(j-i+1 > longest.length()){
                        longest = s.substring(i,j+1);
                    }
                }
            }
        }
        return longest;
    }
    static boolean isPalindrome(int i, int j, String s){
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}