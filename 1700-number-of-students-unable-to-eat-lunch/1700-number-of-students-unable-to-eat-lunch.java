class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for(int i:students){
            q.add(i);
        }
        int i = 0;
        int r = 0;
        while(!q.isEmpty() && r < q.size()){
            if(q.peek() == sandwiches[i]){
                q.poll();
                i++;
                r = 0;
            }
            else{
                q.add(q.poll());
                r++;
            }
        }
        return q.size();
    }
}