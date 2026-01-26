class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        boolean flag = true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                st.push(s.charAt(i));
            }
            else{
                if(st.empty()) return false;
                char ch = st.pop();
                if(s.charAt(i) == ')' && ch == '(') flag = true;
                else if(s.charAt(i) == ']' && ch == '[') flag = true;
                else if(s.charAt(i) == '}' && ch == '{') flag = true;
                else return false;
            }
        }
        return flag && st.isEmpty();
    }
}