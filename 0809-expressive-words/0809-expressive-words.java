class Solution {
    public int expressiveWords(String s, String[] words) {
        int count =0;
        for(String word : words){
            if(isValid(word, s)){
                count++;
            }
        }
        return count;
    }
    static boolean isValid(String org, String em){
        int i=0;
        int j=0;
        if(org.length() > em.length()){
            return false;
        }
        if(org.charAt(i) != em.charAt(j)){
            return false;
        }
        while(i<org.length() && j<em.length()){
            if(org.charAt(i) != em.charAt(j)){
                return false;
            }
            char ch = org.charAt(i);
            int count_org =0;
            while(i< org.length() && org.charAt(i) == ch){
                count_org++;
                i++;
            }
            int count_em = 0;
            char ch_em = em.charAt(j);
            while(j< em.length() && em.charAt(j) == ch_em){
                count_em++;
                j++;
            }
            if(count_em < count_org){
                return false;
            }
            if(count_em > count_org && count_em<3){
                return false;
            }
        }
        return i== org.length() && j == em.length();
    }
}