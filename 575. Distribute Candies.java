Ques Link - https://leetcode.com/problems/distribute-candies/description/

----------------------------------------------------- Solution ------------------------------------------------------

class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < candyType.length && set.size() < candyType.length/2 ; i++){
            set.add(candyType[i]);
        }
        return set.size();
    }
}
