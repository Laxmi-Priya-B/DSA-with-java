// class Solution {
//     public int countStudents(int[] students, int[] sandwiches) {
//         Queue<Integer> q = new LinkedList<>();
//         for(int i:students){
//             q.add(i);
//         }
//         int i = 0;
//         int r = 0;
//         while(!q.isEmpty() && r < q.size()){
//             if(q.peek() == sandwiches[i]){
//                 q.poll();
//                 i++;
//                 r = 0;
//             }
//             else{
//                 q.add(q.poll());
//                 r++;
//             }
//         }
//         return q.size();
//     }
// }

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zero = 0;
        int one = 0;
        for(int i:students){
            if(i == 0){
                zero++;
            }
            else{
                one++;
            }
        }
        for(int i:sandwiches){
            if(i == 0){
                if(zero == 0){
                    return one;
                }
                zero--;
            }
            else{
                if(one == 0){
                    return zero;
                }
                one--;
            }
        }
        return 0;
    }
}