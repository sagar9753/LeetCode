Ques Link - https://leetcode.com/problems/3sum-closest/

-------------------------------------------- Solution ---------------------------------------------

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for(int i = 0 ; i + 2 < nums.length ; i++){
            if(i != 0 && nums[i] == nums[i-1])
                continue;
            int l = i + 1, r = nums.length - 1;

            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];

                if(sum == target)
                    return sum;
                if(Math.abs(target - sum) < Math.abs(target - ans))
                    ans = sum;
                
                if(sum < target)
                    l++;
                else
                    r--;
            }
        }
        return ans;
    }
}
