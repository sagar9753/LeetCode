Ques Link - https://leetcode.com/problems/earliest-possible-day-of-full-bloom/

----------------------------------------- Solution -------------------------------------------------

class Combine{
    public int p;
    public int g;

    public Combine(int p,int g){
        this.p = p;
        this.g = g;
    }
}
class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int pdays = 0;
        int gdays = 0;

        Combine[] arr = new Combine[plantTime.length];

        for (int i = 0; i < plantTime.length; ++i)
            arr[i] = new Combine(plantTime[i], growTime[i]);

        Arrays.sort(arr,(a,b)->b.g - a.g);

        for(Combine ar : arr){
            pdays += ar.p;
            gdays = Math.max(gdays,pdays + ar.g);
        }
        return gdays;
    }
}
