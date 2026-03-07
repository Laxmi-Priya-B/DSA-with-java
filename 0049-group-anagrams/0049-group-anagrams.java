class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
// class Solution {
//     List<List<String>> res = new ArrayList<>();
//     public List<List<String>> groupAnagrams(String[] strs) {
//         HashSet<String> set = new HashSet<>();
//         for(String s:strs){
//             char[] temp = s.toCharArray();
//             Arrays.sort(temp);
//             set.add(new String(temp));
//         }
//         for(String s:set){
//             helper(s,strs);
//         }
//         return res;
//     }
//     void helper(String s, String[] strs){
//         List<String> list = new ArrayList<>();
//         for(String st: strs){
//             char[] temp = st.toCharArray();
//             Arrays.sort(temp);
//             if(s.equals(new String(temp))){
//                 list.add(st);
//             }
//         }
//         res.add(list);
//     }
    
// }