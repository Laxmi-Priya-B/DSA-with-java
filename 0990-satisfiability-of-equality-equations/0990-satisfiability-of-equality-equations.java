class Solution {
    public boolean equationsPossible(String[] equations) {
        int[] parent = new int[26];
        for(int i=0;i<26;i++){
            parent[i] = i;
        }
        for(String eq: equations){
            if(eq.charAt(1) == '=' && eq.charAt(2) == '='){
                union(eq.charAt(0) -'a', eq.charAt(3) - 'a', parent);
            }
        }
        for(int i=0;i<equations.length;i++){
            int a = equations[i].charAt(0) - 'a';
            int b = equations[i].charAt(3) - 'a';
            if(find(a,parent) == find(b,parent) 
            && equations[i].charAt(1) == '!' 
            && equations[i].charAt(2) == '='){
                return false;
            }

        }
        return true;
    }
    static int find(int x, int[] parent){
        if(parent[x]!=x){
            parent[x] = find(parent[x], parent);
        }
        return parent[x];
        
    }
    static void union(int x,int y,int[] parent){
        int px = find(x, parent);
        int py = find(y, parent);
        if(px==py) return;
        else{
            parent[py] =px;
        }
    }
}