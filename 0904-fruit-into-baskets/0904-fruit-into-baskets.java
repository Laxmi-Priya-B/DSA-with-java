class Solution {
    public int totalFruit(int[] fruits) {
        int last = -1;
        int secondLast = -1;
        int lastCount = 0;
        int curr = 0;
        int max = 0;
        for(int fruit:fruits){
            if(fruit == last || fruit == secondLast){
                curr++;
            }
            else{
                curr = lastCount + 1;
            }
            if(fruit == last){
                lastCount++;
            }
            else{
                lastCount=1;
                secondLast = last;
                last = fruit;
            }
            max = Math.max(max,curr);
        }
        return max;
    }
}

// class Solution {
//     public int totalFruit(int[] fruits) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int left = 0;
//         int max = 0;
//         for(int right =0;right<fruits.length;right++){
//             map.put(fruits[right], map.getOrDefault(fruits[right], 0)+1);
//             while(map.size()>2){
//                 map.put(fruits[left], map.get(fruits[left])-1);
//                 if(map.get(fruits[left]) == 0){
//                     map.remove(fruits[left]);
//                 }
//                 left++;
//             }
//             max = Math.max(max, right - left+1);
//         }
//         return max;
//     }
// }