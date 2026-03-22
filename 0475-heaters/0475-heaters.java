class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);

        int i=0;
        int res = 0;
        for(int house:houses){
            while (i < heaters.length - 1 && Math.abs(heaters[i + 1] - house) <= Math.abs(heaters[i] - house)) {
                i++;
            }

            int dist = Math.abs(heaters[i] - house);
            res = Math.max(res, dist);
        }
        return res;
    }
}

// class Solution {
//     public int findRadius(int[] houses, int[] heaters) {
//         int res = 0;
//         for(int i:houses){
//             int min = Integer.MAX_VALUE;
//             for(int h:heaters){
//                 min = Math.min(min, Math.abs(i-h));
//             }
//             res = Math.max(res, min);
//         }
//         return res;
//     }
// }