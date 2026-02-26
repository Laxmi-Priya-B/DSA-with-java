class Solution {
    List<String> res = new ArrayList<>();
    String[] arr = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };
    public List<String> letterCombinations(String digits){
        helper(digits,new StringBuilder(),0);
        return res;
    }
    void helper(String digits,StringBuilder sb,int idx){
        if(idx==digits.length()){
            res.add(sb.toString());
            return;
        }
        int digit = digits.charAt(idx)-'0';
        String letters = arr[digit];
        for(char c:letters.toCharArray()){
            sb.append(c);
            helper(digits,sb,idx+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
        



    // HashMap<Character,String> map = new HashMap<>();
    // List<String> res = new ArrayList();
    // Solution(){
    //     map.put('2',"abc");
    //     map.put('3',"def");
    //     map.put('4',"ghi");
    //     map.put('5',"jkl");
    //     map.put('6',"mno");
    //     map.put('7',"pqrs");
    //     map.put('8',"tuv");
    //     map.put('9',"wxyz");
    // }
    // public List<String> letterCombinations(String digits) {
    //     if(digits.length()<1){
    //         return res;
    //     }
    //     helper(digits,0,"");
    //     return res;
    // }
    // public void helper(String digits, int i, String curr){
    //     if(i==digits.length()){
    //         res.add(curr);
    //         return;
    //     }
    //     String letters = map.get(digits.charAt(i));
    //     for(int j=0;j<letters.length();j++){
    //         helper(digits,i+1,curr+letters.charAt(j));
    //     }
    // }
}