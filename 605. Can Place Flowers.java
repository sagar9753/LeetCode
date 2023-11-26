Ques Link - https://leetcode.com/problems/can-place-flowers/

-------------------------------------- Solution -----------------------------------------

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length;
        for(int i = 0 ; i < l && n > 0 ; i++){
            if(flowerbed[i] == 0){
                if((i-1 == -1 || flowerbed[i-1] != 1) && (i+1 == l || flowerbed[i+1] != 1)){
                    n--;
                    flowerbed[i] = 1;
                }
            }
        }
        if(n == 0)
            return true;
        return false;
    }
}
