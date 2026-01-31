class Solution {
    public int findTheWinner(int n, int k) {
        int count =0;
        for(int i=1;i<=n;i++){
            count = (count+k)%i;
        }
        return count+1;
        // List<Integer> list = new ArrayList<>();
        // for (int i = 1; i <= n; i++){
        //     list.add(i);
        // } 

        // int i = 0;
        // while (list.size() > 1) {
        //     i = (i + k - 1) % list.size();
        //     list.remove(i);
        // }
        // return list.get(0);
    }
}
