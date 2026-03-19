class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                int prev = st.pop();
                res[prev] = i-prev;
            }
            st.push(i);
        }
        return res;
    }
}

// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
//         int[] res = new int[temperatures.length];
//         for(int i=0;i<temperatures.length;i++){
//             for(int j=i+1;j<temperatures.length;j++){
//                 if(temperatures[j]>temperatures[i]){
//                     res[i] = j-i;
//                     break;
//                 }
//             }
//         }
//         return res;
//     }
// }