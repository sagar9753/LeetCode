Ques Link - https://leetcode.com/problems/find-indices-with-index-and-value-difference-i/

----------------------------------------------- Solution ---------------------------------------------------

class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int[] ans = new int[2];
        
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i + indexDifference ; j < nums.length ; j++){
                if(Math.abs(nums[i] - nums[j]) >= valueDifference)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
