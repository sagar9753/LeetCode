Ques link - https://leetcode.com/problems/apple-redistribution-into-boxes

-------------------------------- solution ----------------------------------

class Solution {
    public int minimumBoxes(int[] apple, int[] cap) {
        Arrays.sort(cap);
        int i = 0 ,j = cap.length-1;
        while(i < apple.length){
            if(cap[j] >= apple[i]){
                cap[j] -= apple[i];
                apple[i] = 0;
            }
            else{
                apple[i] -= cap[j];
                cap[j] = 0;
            }
            if(apple[i] == 0)
                i++;
            if(cap[j] == 0 && i < apple.length)
                j--;
        }
        return cap.length - j;
        
    }
}
