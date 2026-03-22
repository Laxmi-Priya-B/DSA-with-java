class Solution {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> partition(String s) {
        helper(s, 0, new ArrayList<>());
        return res;
    }

    void helper(String s, int idx, List<String> list){
        if(idx == s.length()){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<s.length();i++){
            String sub = s.substring(idx,i+1);
            if(isPalindrome(sub)){
                list.add(sub);
                helper(s,i+1,list);
                list.remove(list.size()-1);
            }
        }
    }
    boolean isPalindrome(String s){
        if(s.length() == 0) return false;
        int i = 0;
        int j = s.length()-1;
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