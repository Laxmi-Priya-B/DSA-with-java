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

        
        // return last(n,k)+1;

    }
    // static int last(int n,int k){
    //     if(n==1) return 0;

    //     return ((last(n-1,k))+k)%n;
    // }

}
