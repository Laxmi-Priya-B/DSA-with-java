class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:deck){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int t = 0;
        for(int val:map.values()){
            if(t == -1){
                t = val;
            }
            else{
                t = gcd(t,val);
            }
            if(t == 1) return false;
        }
        return t >= 2;
    }

    int gcd(int a,int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}