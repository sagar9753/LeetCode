Ques Link - https://leetcode.com/problems/hand-of-straights

--------------------------- Solution ------------------------------

class Solution {
    public boolean isNStraightHand(int[] hand, int gpSize) {
        Map<Integer,Integer> mp = new HashMap<>();

        for(int num : hand)
            mp.put(num, mp.getOrDefault(num,0)+1);
        
        int[] keys = new int[mp.size()];
        int i = 0;
        for(int key : mp.keySet())
            keys[i++] = key;

        Arrays.sort(keys);
        for(int j = 0 ; j < keys.length ; ){
            int key = keys[j];
            if(mp.getOrDefault(key,0) > 0){
                for(i = key ; i < key+gpSize ; i++){
                    int val = mp.getOrDefault(i,0);
                    if(val == 0)
                        return false;
                    mp.put(i,mp.get(i)-1);
                }
            }
            else
                j++;
        }
        return true;
    }
}
