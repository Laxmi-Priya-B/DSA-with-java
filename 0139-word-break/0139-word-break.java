class Solution {
    HashMap<String, Boolean> map = new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        return helper(s, wordDict);
    }

    boolean helper(String s, List<String> wordDict){
        if(s.length() == 0){
            return true;
        }
        if(map.containsKey(s)) return map.get(s);
        for(String word:wordDict){
            if(s.startsWith(word)){
                String remaining = s.substring(word.length());
                if(helper(remaining, wordDict)){
                    map.put(s,true);
                    return true;
                }
            }
        }
        map.put(s,false);
        return false;
    }
}