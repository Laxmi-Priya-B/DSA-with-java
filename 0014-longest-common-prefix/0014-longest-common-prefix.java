class Solution {
    public String longestCommonPrefix(String[] strs) {
        String min = strs[0];
        for(int i=1;i<strs.length;i++){
            if(strs[i].length()<min.length()){
                min = strs[i];
            }
        }
        for(int i=0;i<min.length();i++){
            char c = min.charAt(i);
            for(int j=0;j<strs.length;j++){
                if(strs[j].charAt(i)!=c){
                    return min.substring(0,i);
                }
            }
        }
        return min;
    }
}