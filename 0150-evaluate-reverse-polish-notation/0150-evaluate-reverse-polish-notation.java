class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if (!tokens[i].equals("+") && !tokens[i].equals("-") &&
    !tokens[i].equals("*") && !tokens[i].equals("/")){
                st.push(Integer.parseInt(tokens[i]));
            }else{
                if(!st.isEmpty()){
                    int temp=0;
                    int n1 = st.pop();
                    int n2 = st.pop();
                    if(tokens[i].equals("+")){
                        temp = n1+n2;
                    }
                    else if(tokens[i].equals("-")){
                        temp = n2-n1;
                    }
                    else if(tokens[i].equals("*")){
                        temp = n1*n2;
                    }
                    else{
                        temp = n2/n1;
                    }
                    st.push(temp);
                }
            }
        }
        return st.peek();
    }
}