class Solution {
    public int maxVowels(String s, int k) {
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        int count=0;
        if(s.length()==1){
            if(list.contains(s.charAt(0))) return 1;
            else return 0;
        }
        
        // for(int i=0;i<=s.length()-k;i++){
        //     int c=0;
        //     for(int j=i;j<i+k;j++){
        //         if(list.contains(s.charAt(j))){
        //             c++;
        //         }
        //         count = Math.max(count,c);
        //     }
        // }
        for(int i=0;i<k;i++){
            if(list.contains(s.charAt(i))){
                count++;
            }
        }
        int i=0;
        int j=k;
        int maxC =count;
        while(j<s.length()){
            if(list.contains(s.charAt(i))){
                count--;
            }
            if(list.contains(s.charAt(j))){
                count++;
            }
            i++;
            j++;
            maxC = Math.max(count,maxC);
        }
        return maxC;
    }
}