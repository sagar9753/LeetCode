class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> num1=new HashSet();
        HashSet<Integer> num2=new HashSet();

        for(int i=0;i<nums1.length;i++)
        {
            num1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(num1.contains(nums2[i]))
                num2.add(nums2[i]);
        }
        int i=0;
        int[] result=new int[num2.size()];
        for(int r:num2){
            result[i++]=r;
        }
        return result;
    }
}
