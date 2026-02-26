class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length ==0){
            return 0;
        }
        if(stones.length==1) return stones[0];
        List<Integer> list = new ArrayList<>();
        for(int n:stones){
            list.add(n);
        }
        int res = 0;
        
        while(list.size()>1){
            int max1=0;
            int max2=0;
            for(int i=0;i<list.size();i++){
                if(list.get(i)>max1){
                    max2=max1;
                    max1=list.get(i);
                }
                else if(list.get(i)>max2){
                    max2=list.get(i);
                }
            }
            list.remove(Integer.valueOf(max1));
            list.remove(Integer.valueOf(max2));
            if(max1!=max2){
                list.add(Math.abs(max1-max2));
            }
        }
        if(list.size()<1) return 0;
        return list.get(0);
    }
    
}