-------------------------------------------- Array (Easy) -------------------------------------
  
Ques Link - https://leetcode.com/problems/semi-ordered-permutation/

------------------------------------------- Solution -----------------------------------------
  
class Solution {
    public int semiOrderedPermutation(int[] nums) {

        int temp,j,i;
        int c=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==1)
                break;
        }
        for(j=i-1;i>0;j--,i--){
            temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            c++;
        }

        for(i=0;i<nums.length;i++){
            if(nums[i]==nums.length)
                break;
        }

        for(j=i+1;i<nums.length-1;i++,j++){
            temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            c++;
        }

        return c;
    }
}
