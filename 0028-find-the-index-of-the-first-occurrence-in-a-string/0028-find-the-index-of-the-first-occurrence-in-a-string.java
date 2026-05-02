class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        
        for(int i=0;i<=haystack.length()-len;i++){
            String substr = haystack.substring(i,i+len);
            if(substr.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}