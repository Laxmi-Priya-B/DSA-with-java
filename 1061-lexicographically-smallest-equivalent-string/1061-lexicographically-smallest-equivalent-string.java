class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int[] parent = new int[26];
        for(int i=0;i<26;i++){
            parent[i] = i;
        }
        for(int i=0;i<s1.length();i++){
            union(s1.charAt(i)-'a', s2.charAt(i)-'a',parent);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<baseStr.length();i++){
            char ch = baseStr.charAt(i);
            int root = find(ch-'a',parent);
            sb.append((char)('a'+root));
        }
        return sb.toString();
    }
    static int find(int x, int[] parent){
        if(parent[x]!=x){
            parent[x] = find(parent[x],parent);
        }
        return parent[x];
    }
    static void union(int x, int y, int[] parent){
        int px = find(x,parent);
        int py = find(y,parent);
        if(px==py) return;
        if(px < py){
            parent[py] = px;
        }
        else{
            parent[px] = py;
        }
    }
}